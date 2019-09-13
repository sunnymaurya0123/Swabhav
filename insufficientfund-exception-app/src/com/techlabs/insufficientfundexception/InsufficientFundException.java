package com.techlabs.insufficientfundexception;

public class InsufficientFundException extends RuntimeException{
	private String message;
	public InsufficientFundException(Account account){
		printInfo(account);
	}
	
	public String getMessage() {
		return message;
	}
	
	void printInfo(Account account){
		System.out.println("The "+account.getAccountNumber()+account.getName()+account.getBalance());
	}
	
}
