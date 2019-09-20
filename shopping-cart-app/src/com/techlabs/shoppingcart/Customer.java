package com.techlabs.shoppingcart;

import java.util.*;

public class Customer {
	private int id;
	private String name;
	private List<Order> orders;
	private int orderCount;
	
	public Customer(int id,String name){
		orders=new ArrayList();
		this.id=id;
		this.name=name;
		orderCount++;
	}
	
	public void addOrder(Order order) {
		orders.add(order);
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Iterable<Order> getOrders() {
		return orders;
	}

	public int getOrderCount() {
		return orderCount;
	}

}
