package com.techlabs.payment;

public class NetBanking implements IPayment{
	private String userName;
	private String password;
	
	public NetBanking(String userName,String password){
		this.userName=userName;
		this.password=password;
	}

	@Override
	public void pay(int amount) {
		System.out.println("The amount paid through Net Banking: $"+amount);
		
	}
	
}
