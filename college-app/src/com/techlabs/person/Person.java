package com.techlabs.person;

public class Person {
	private static int personId;
	private int id; 
	protected String address;
	private String dob;
	
	static {
		personId=100;
	}

	public Person(String address, String dob) {
		id=++personId;
		this.address=address;
		this.dob=dob;
	}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}
	
	public String getDob() {
		return dob;
	}

}
