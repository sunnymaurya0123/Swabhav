package com.techlabs.clone;

import com.techlabs.account.Account;

public class AccountTest {

	public static void main(String[] args) {

		try {
			Account account1 = new Account("68465", "Sunny", 5000);
			Account account2 = (Account) account1.clone();
			printInfo(account1);
			printInfo(account2);
		} catch (CloneNotSupportedException e) {
			System.out.println("CloneNotSupportedException");
			e.printStackTrace();
		}

	}

	static void printInfo(Account account) {
		System.out.println("Name: " + account.getName() + "\nAccount Number: " + account.getAccountNumber()
				+ "\nAccount Balance: " + account.getBalance() + "\nAccount hashcode: " + account.hashCode() + "\n");
	}

}
