package com.techlabs.account;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountUnitTest {

	private Account account1 = new Account("165431984", "Sunny", 1000);
	@Test
	void testWithdrawingLessThanMinBalance() {
		try {
		account1.withdraw(50);
		} catch(RuntimeException e){
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	void testWithdrawingLessThanAccountBalance() {
		try {
			account1.withdraw(501);
		} catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

}
