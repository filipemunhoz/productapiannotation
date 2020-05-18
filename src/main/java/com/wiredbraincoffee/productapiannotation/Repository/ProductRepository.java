package com.wiredbraincoffee.productapiannotation.Repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.wiredbraincoffee.productapiannotation.model.Product;

public interface ProductRepository extends ReactiveMongoRepository<Product, String>{

}
