package com.techlabs.account;

public class SavingAccount extends Account {
	private final static int MIN_AMOUNT = 500;
	public SavingAccount(String accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
	}
	
	public SavingAccount(String accountNumber, String name) {
		super(accountNumber, name, MIN_AMOUNT);
	}

	@Override
	void withdraw(int amount) {
		double newBalance=0;
		if (amount >= MIN_AMOUNT && amount <= balance)
			 newBalance = balance - amount;
		if(newBalance>=MIN_AMOUNT)
			balance=newBalance;
		
		else if (amount < MIN_AMOUNT)
			System.out.println("Minimum amount to withdraw is: $" + MIN_AMOUNT);
		else
			System.out.println("Not Enough Balance!!!");
		
	}
}
