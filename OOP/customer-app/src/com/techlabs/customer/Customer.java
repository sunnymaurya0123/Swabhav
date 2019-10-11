package com.techlabs.customer;

public class Customer {
	
	private String firstName;
	private String lastName;
	private int customerId;
	private static int idIncreementor;
	static {
		idIncreementor=1000;
	}
	
	public Customer(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.customerId=++idIncreementor;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return customerId;
	}
	
}
