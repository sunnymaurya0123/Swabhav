package com.techlabs.model;

public class Contact {
	private int id;
	private String firstName;
	private String lastName;
	private String emailId;
	private String phoneNo;
	
	public Contact(String firstName,String lastName,String emailId,String phoneNo) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.emailId=emailId;
		this.phoneNo=phoneNo;
	}
	
	public Contact(int id,String firstName,String lastName,String emailId,String phoneNo) {
		this(firstName,lastName,emailId,phoneNo);
		this.id=id;
	}
	
	public int getId() {
		return id;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	
	
	
}
