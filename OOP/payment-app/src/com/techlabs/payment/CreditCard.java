package com.techlabs.payment;

public class CreditCard implements IPayment{
	private String name;
	private long cardNumber;
	private int cvv;
	private String expiryDate;
	
	public CreditCard(String name, long cardNumber, int cvv, String expiryDate){
		this.name=name;
		this.cardNumber=cardNumber;
		this.cvv=cvv;
		this.expiryDate=expiryDate;
	}

	@Override
	public void pay(int amount) {
		System.out.println("The amount paid through Credit Card: $"+amount);
		
	}
	
	
}
