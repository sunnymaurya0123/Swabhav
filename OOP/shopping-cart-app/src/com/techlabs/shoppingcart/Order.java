package com.techlabs.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int id;
	private String date;
	private List<LineItem> items;
	private int itemCount;
	
	public Order(int id,String date) {
		items=new ArrayList();
		this.id=id;
		this.date=date;
		itemCount++;
	}
	
	public void add(LineItem lineItem) {
		items.add(lineItem);
	}
	
	public int getId() {
		return id;
	}

	public String getDate() {
		return date;
	}

	public List<LineItem> getItems() {
		return items;
	}
	
	public int getItemCount() {
		return itemCount;
	}
	
}
