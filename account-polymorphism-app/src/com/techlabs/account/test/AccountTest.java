package com.techlabs.account.test;

import com.techlabs.account.Account;
import com.techlabs.account.CurrentAccount;
import com.techlabs.account.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
		CurrentAccount currentAccount=new CurrentAccount("6541","Sunny",5000);
		currentAccount.withdraw(6000);
		printInfo(currentAccount);
		currentAccount.deposit(500);
		printInfo(currentAccount);
		currentAccount.withdraw(1300);
		printInfo(currentAccount);

		SavingAccount savingAccount=new SavingAccount("9847","Maurya",4600);
		printInfo(savingAccount);

	}
	static void printInfo(Account account) {
		System.out.println("Account Name: "+account.getName()+"\nAccount Number: "+account.getAccountNumber()
							+"\nAccount Balance: "+account.getBalance()+"\n");
	}
}
