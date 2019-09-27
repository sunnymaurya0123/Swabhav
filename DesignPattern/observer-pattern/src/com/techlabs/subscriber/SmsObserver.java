package com.techlabs.subscriber;

import com.techlabs.publisher.Account;
import com.techlabs.publisher.IBalanceChangeObserver;

public class SmsObserver implements IBalanceChangeObserver {

	@Override
	public void update(Account account) {
		System.out.println("Through SMS Account Name: " + account.getName() + " Account no: " + account.getAccno()
				+ " Account Balance: " + account.getBalance());

	}

}
