package com.techlabs.actions;

import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tachlabs.model.Contact;
import com.techlabs.service.ContactService;
import com.techlabs.viewmodels.ContactDisplayViewModel;

public class ContactDisplayAction extends ActionSupport implements ModelDriven<ContactDisplayViewModel> {

	ContactDisplayViewModel contactDisplayViewModel;
	ContactService contactService=ContactService.getInstance();
	List<Contact> contactList=contactService.get();
	
	public ContactDisplayAction() {
		System.out.println("Inside Constructor");
		contactDisplayViewModel=new ContactDisplayViewModel();
	}
	
	@Override
	public String execute() {
		System.out.println("Inside ContactAction execute");
		return this.SUCCESS;
	}

	@Override
	public ContactDisplayViewModel getModel() {
		return contactDisplayViewModel;
	}

	public List<Contact> getContactList() {
		return contactList;
	}

}
