package com.techlabs.service;

import java.util.List;

import com.tachlabs.model.Contact;

public class ContactService {
	private static ContactService contactService;
	private List<Contact> contactList;
	Contact c1=new Contact("Sunny","sunny@gmail.com","989270774");
	Contact c2=new Contact("Ravi","ravi@gmail.com","88983568");
	Contact c3=new Contact("Akash","akash@gmail.com","9849646121");
	
	private ContactService() {
		
	}
	
	public static ContactService getInstance() {
		if(contactService==null)
			contactService=new ContactService();
		return contactService;
	}
	
	public List<Contact> get(){
		return contactList;
	}
	
	public void add(Contact contact) {
		contactList.add(contact);
	}
}
