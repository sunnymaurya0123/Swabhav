package com.techlabs.lineitem;

public class LineItem {
	private int id;
	private String productName;
	private int quantity;
	private double price;

	public LineItem(int id, String productName, int quantity, int price) {
		this.id=id;
		this.productName=productName;
		this.quantity=quantity;
		this.price=price;
	}

	public int getId() {
		return id;
	}

	public String getProductName() {
		return productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

}
