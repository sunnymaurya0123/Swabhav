package com.techlabs.statements;

public class Contact {
	private String firstName;
	private String lastName;
	private String emailId;
	private int phoneNo;
	
	public Contact(String firstName,String lastName,String emailId,int phoneNo) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.emailId=emailId;
		this.phoneNo=phoneNo;
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

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
}
