package com.techlabs.account;

public class Account {
	private String accountNumber;
	private String name;
	private double balance;
	private final static int MIN_AMOUNT = 500;

	public Account(String accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
	}

	public Account(String accountNumber, String name) {
		this(accountNumber, name, MIN_AMOUNT);
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {
		double newBalance=0;
		if (amount >= MIN_AMOUNT && amount <= balance)
			 newBalance = balance - amount;
		if(newBalance>=MIN_AMOUNT)
			balance=newBalance;
		
		else if (amount < MIN_AMOUNT)
			throw new RuntimeException("Minimum amount to withdraw is: $" + MIN_AMOUNT);
			//System.out.println("Minimum amount to withdraw is: $" + MIN_AMOUNT);
		else {
			System.out.println("Not Enough Balance!!!");
			throw new RuntimeException("Withdraw Unsuccessful!!!  Minimum amount to withdraw is: $"+MIN_AMOUNT);
		}
	}

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
