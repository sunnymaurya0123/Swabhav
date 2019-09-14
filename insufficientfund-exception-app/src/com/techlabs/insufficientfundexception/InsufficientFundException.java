package com.techlabs.insufficientfundexception;

public class InsufficientFundException extends RuntimeException{
	
	private String message;
	public InsufficientFundException(Account account){
		message="The Account Number: "+account.getAccountNumber()+" of "+account.getName()+
				" has Account Balance: "+account.getBalance()+" and tries to withdraw "+account.getAmount()+" from Union Bank. "
						+ "\nPlease maintain the minimum balance because it has insufficient funds.";
	}
	
	@Override
	public String getMessage() {
		return message;
		
	}
	
}
