package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.viewmodels.ContactAddViewModel;

public class ContactAddAction extends ActionSupport implements ModelDriven<ContactAddViewModel>{

	ContactAddViewModel contactAddViewModel;
	@Override
	public ContactAddViewModel getModel() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String execute() {
		System.out.println("Inside ContactAddAction execute");
		return this.SUCCESS;
	}

}
