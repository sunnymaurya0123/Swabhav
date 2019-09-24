package com.techlabs.payment.test;

import com.techlabs.payment.CreditCard;
import com.techlabs.payment.NetBanking;

public class PaymentTest {

	public static void main(String[] args) {
		CreditCard creditCard=new CreditCard("Sunny",2013676841,341,"08/26");
		creditCard.pay(500);
		
		NetBanking netBanking=new NetBanking("sunnyM97","sunny");
		netBanking.pay(1370);

	}

}
