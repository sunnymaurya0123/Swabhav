package com.techlabs.insufficientfundexception;

public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account("165431984", "Sunny", 1000);
		Account account2 = new Account("984654616", "Maurya");
		// account1.deposit(300);
		try {
		account1.withdraw(501);
		}
		catch(InsufficientFundException ex) {
			System.out.println(ex.getMessage());
			//ex.printStackTrace();
		}
		printInfo(account1);
		System.out.println();
	}

	static void printInfo(Account account) {
		System.out.println("Account Name: " + account.getName() + "\nAccount Number: " + account.getAccountNumber()
				+ "\nTotal Balance: " + account.getBalance());

	}

}
