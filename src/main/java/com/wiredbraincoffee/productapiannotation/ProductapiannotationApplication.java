package com.wiredbraincoffee.productapiannotation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.wiredbraincoffee.productapiannotation.Repository.ProductRepository;
import com.wiredbraincoffee.productapiannotation.model.Product;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class ProductapiannotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductapiannotationApplication.class, args);
	}

	@Bean
	CommandLineRunner init(ProductRepository repository) {
		
		return args -> {
			
			Flux<Product> flux = Flux.just(
					new Product(null, "Curso 1", 500.00),
					new Product(null, "Curso 2", 1200.00),
					new Product(null, "Curso 3", 700.00))
					.flatMap(repository::save);
			
			
			flux.thenMany(repository.findAll())
			.subscribe(System.out::println);
		};
		
		
		
		
	}
	
	
}
