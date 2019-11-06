package com.techlabs.service;

import java.util.List;

import com.techlabs.model.BankMaster;
import com.techlabs.model.BankTransaction;
import com.techlabs.repository.BankRepository;

public class BankService {
	
	private static BankService singleObject;
	private BankRepository bankRepo=new BankRepository();

	private BankService() {
		System.out.println("Inside BankService");
	}
	
	public static BankService getInstance() {
		if(singleObject==null)
			singleObject=new BankService();
		return singleObject;
	}
	
	public void addAccount(BankMaster bankMaster, BankTransaction bankTransaction) {
		bankRepo.addAccount(bankMaster,bankTransaction);
	}

	public boolean validate(String userName, String password) {
		return bankRepo.validate(userName,password);
	}

	public double getUserBalance(String userName) {
		
		return bankRepo.getUserBalance(userName);
	}

	public void updateAccount(BankTransaction bankTransaction) {
		bankRepo.updateAccount(bankTransaction);
	}
	
	public List<BankTransaction> get(String userName) {
		
		return bankRepo.get(userName);
		
	}

}
