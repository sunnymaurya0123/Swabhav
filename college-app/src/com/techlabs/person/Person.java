package com.techlabs.person;

public class Person {
	private int id;
	protected String address;
	private String dob;

	public Person(String address, String dob) {
		this.address=address;
		this.dob=dob;
	}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public String getDateOfBirth() {
		return dob;
	}
}
