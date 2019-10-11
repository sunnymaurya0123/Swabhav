package com.techlabs.account;

public abstract class Account {
	private String accountNumber;
	private String name;
	protected double balance;
	
	public Account(String accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
	}
	
	public void deposit(int amount){
		balance=balance+amount;
	}
	
	abstract void withdraw(int amount);
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
}
