package com.techlabs.actions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Contact;
import com.techlabs.service.ContactService;

public class ContactDisplayAction implements Action {

	@Autowired
	private ContactService contactService;
	private List<Contact> contactList;
	
	public ContactDisplayAction() {
		System.out.println("Inside Constructor");
	}
	
	@Override
	public String execute() {
		System.out.println("Inside ContactAction execute");
		contactList=contactService.get();
		return this.SUCCESS;
	}

	public List<Contact> getContactList() {
		return contactList;
	}

}
