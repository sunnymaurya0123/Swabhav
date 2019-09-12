package com.techlabs.account.test;

import java.util.*;
import com.techlabs.account.Account;
import com.techlabs.account.CurrentAccount;
import com.techlabs.account.SavingAccount;

public class AccountTest {
	
	public static void main(String[] args) {
		
		ArrayList<Account> accountList=new ArrayList<Account>();
		CurrentAccount currentAccount=new CurrentAccount("6541","Sunny",5000);
		accountList.add(currentAccount);
		currentAccount.withdraw(6000);
		currentAccount.deposit(500);
		currentAccount.withdraw(1300);

		SavingAccount savingAccount=new SavingAccount("9847","Maurya",4600);
		accountList.add(savingAccount);
		
		savingAccount.deposit(500);
		currentAccount.deposit(2000);
		
		printInfo(accountList);
		System.out.println("List Size: "+accountList.size());
		
	}

	
	static void printInfo(ArrayList<Account> accountList) {
		for(Iterator<Account> i=accountList.iterator();i.hasNext();) {
			Account account=(Account)i.next();
			System.out.println("Account Name: "+account.getName()+"\nAccount Number: "+account.getAccountNumber()
			+"\nAccount Balance: "+account.getBalance()+"\n");
		}
		for(Account account:accountList) {
			System.out.println("Account Name: "+account.getName()+"\nAccount Number: "+account.getAccountNumber()
			+"\nAccount Balance: "+account.getBalance()+"\n");
		}
	}
	
}
