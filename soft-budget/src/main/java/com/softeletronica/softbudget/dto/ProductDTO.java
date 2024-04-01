package com.softeletronica.softbudget.dto;

import com.softeletronica.softbudget.entities.Product;

public class ProductDTO {

	private Long id;
	private String name;
	private Double price;

	public ProductDTO() {

	}

	public ProductDTO(Long id, String name, Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public ProductDTO(Product entity) {

		id = entity.getId();
		name = entity.getName();
		price = entity.getPrice();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}
	
	

}
