package com.techlabs.account.test;

import com.techlabs.account.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account("165431984", "Sunny", 1000);
		Account account2 = new Account("984654616", "Maurya");
		
		try {
		account1.withdraw(50);
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		printInfo(account1);
		System.out.println();
		
	}

	static void printInfo(Account account) {
		System.out.println("Account Name: " + account.getName() + "\nAccount Number: " + account.getAccountNumber()
				+ "\nTotal Balance: " + account.getBalance());

	}

}
