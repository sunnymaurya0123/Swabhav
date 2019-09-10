package com.techlabs.account;

public class CurrentAccount extends Account {

	private static final int MIN_AMOUNT = 0;
	private static final int CREDIT = 2000;
	private double remainCredit = 2000;
	private double usedCredit;

	public double getRemainCredit() {
		return remainCredit;
	}

	public double getUsedCredit() {
		return usedCredit;
	}

	public CurrentAccount(String accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
	}

	public CurrentAccount(String accountNumber, String name) {
		super(accountNumber, name, MIN_AMOUNT);
	}

	@Override
	public void withdraw(int amount) {
		if (balance + remainCredit >= amount) {
			 updateBalance(amount);
			 
		} else
			System.out.println("No sufficient balance");
	}

	private void updateBalance(int amount) {
		if (amount <= balance) {
			balance = balance - amount;
		} else {
			usedCredit = amount - balance;
			balance = balance - (amount - usedCredit);
			remainCredit = remainCredit - usedCredit;
			System.out.println("Remaining Credit: "+remainCredit);
		}
		
	}

}
