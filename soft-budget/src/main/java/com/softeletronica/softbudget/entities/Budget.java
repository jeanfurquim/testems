package com.softeletronica.softbudget.entities;

import java.io.Serializable;

public class Budget implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private Double price;
	private Double tax;
	private Double discount;


	public Budget() {

	}

	public Budget(String name, Double price, Double tax, Double discount) {
		this.name = name;
		this.price = price;
		this.tax = tax;
		this.discount = discount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

}
