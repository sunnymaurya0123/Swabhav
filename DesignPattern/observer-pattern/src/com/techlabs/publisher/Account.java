package com.techlabs.publisher;

import java.util.LinkedList;
import java.util.List;

public class Account {
	private String accno;
	private String name;
	private double balance;
	private List<IBalanceChangeObserver> subscriber;

	public Account(String accno, String name, double balance) {
		subscriber = new LinkedList<IBalanceChangeObserver>();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
		for (IBalanceChangeObserver eachSubscriber : subscriber)
			eachSubscriber.update(this);
	}

	public void withdraw(double amount) {
		balance = balance - amount;
	}

	public String getAccno() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public List<IBalanceChangeObserver> getSubscriber() {
		return subscriber;
	}

	public void addSubscriber(IBalanceChangeObserver observable) {
		subscriber.add(observable);
	}

	public void removeSubscriber(IBalanceChangeObserver observable) {
		subscriber.remove(observable);
	}
}
