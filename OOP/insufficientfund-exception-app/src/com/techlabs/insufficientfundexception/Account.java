package com.techlabs.insufficientfundexception;

public class Account {
	private String accountNumber;
	private String name;
	private double balance;
	private final static int MIN_AMOUNT = 500;
	private double amount;

	public double getAmount() {
		return amount;
	}

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

	public void withdraw(double amount) throws InsufficientFundException {
		this.amount=amount;
		double newBalance=0;
		if (amount >= MIN_AMOUNT && amount <= balance)
			 newBalance = balance - amount;
		if(newBalance>=MIN_AMOUNT)
			balance=newBalance;
		
		else if (amount < MIN_AMOUNT)
			System.out.println("Minimum amount to withdraw is: $" + MIN_AMOUNT);
		else {
			throw new InsufficientFundException(this);
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
