package com.wiredbraincoffee.productapiannotation.model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

	@Id
	private String id;
	
	private String name;
	
	private Double price;
	
}
