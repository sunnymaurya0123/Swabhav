package com.techlabs.model;

import java.sql.Date;

public class BankTransaction {
	private String name;
	private String type;
	private double amount;
	private Date date;
	
	public BankTransaction(String name,double amount,String type,Date date) {
		this.name=name;
		this.amount=amount;
		this.type=type;
		this.date=date;
	}
	
	public BankTransaction() {
		
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}

	public Date getDate() {
		return date;
	}
	
	
}
