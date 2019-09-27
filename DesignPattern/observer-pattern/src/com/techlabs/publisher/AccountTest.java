package com.techlabs.publisher;

import com.techlabs.subscriber.EmailObserver;
import com.techlabs.subscriber.SmsObserver;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account("101", "Sunny", 800);
		account.deposit(100);
		System.out.println(account.getBalance());
		account.addSubscriber(new SmsObserver());
		EmailObserver e = new EmailObserver();
		account.addSubscriber(e);
		account.deposit(100);
		System.out.println(account.getBalance());
		account.removeSubscriber(e);
		account.deposit(100);

	}

}
