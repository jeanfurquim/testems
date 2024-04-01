package com.softeletronica.softbudget.dto;

import com.softeletronica.softbudget.entities.Budget;

public class BudgetDTO {

	private String name;
	private Double price;
	private Double tax;
	private Double discount;

	public BudgetDTO() {
	}

	public BudgetDTO(String name, Double price, Double tax, Double discount) {
		this.name = name;
		this.price = price;
		this.tax = tax;
		this.discount = discount;

	}

	public BudgetDTO(Budget entity) {
		name = entity.getName();
		price = entity.getPrice();
		tax = entity.getTax();
		discount = entity.getDiscount();

	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public Double getTax() {
		return tax;
	}

	public Double getDiscount() {
		return discount;
	}

	public Double getTotal() {
		double totalPriceWithTax = price * (1 + tax / 100);
		double totalPriceWithDiscount = totalPriceWithTax * (1 - discount / 100);
		return totalPriceWithDiscount;
	}

}