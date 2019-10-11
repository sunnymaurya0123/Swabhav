package com.techlabs.contact;

public class Contact  {
	private long contactNumber;
	private String name;
	private String email_id;
	
	public String getName() {
		return name;
	}

	public String getEmail_id() {
		return email_id;
	}

	public Contact(long number,String names,String email) {
		this.contactNumber=number;
		this.name=names;
		this.email_id=email;
		
	}
	
	public long getContactNumber() {
		return contactNumber;
	}
	
}
