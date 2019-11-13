package com.techlabs.model;

import java.util.UUID;

public class Contact {
	private String name;
	private String email;
	private String phoneNo;
	private UUID uuid;
	
	public Contact(String name,String email,String phoneNo) {
		uuid = UUID.randomUUID();
		this.name=name;
		this.email=email;
		this.phoneNo=phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public UUID getUuid() {
		return uuid;
	}

}
