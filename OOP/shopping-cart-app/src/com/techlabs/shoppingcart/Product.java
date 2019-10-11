package com.techlabs.shoppingcart;

public class Product {
	private int id;
	private String name;
	private double price;
	private float discountPercent;

	public Product(int id, String name, double price, float discountPercent) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.discountPercent = discountPercent;
		//calculateProductCost();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public float getDiscountPercent() {
		return discountPercent;
	}

	public double calculateProductCost() {
		double pricePercent = price * ((double) discountPercent / 100);
		price = price - pricePercent;
		return price;
	}

}
