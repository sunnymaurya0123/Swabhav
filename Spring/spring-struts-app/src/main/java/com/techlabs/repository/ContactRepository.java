package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.techlabs.model.Contact;

@Repository
public class ContactRepository {
	
	private List<Contact> contactList;
	Contact c1=new Contact("Sunny","sunny@gmail.com","989270774");
	Contact c2=new Contact("Ravi","ravi@gmail.com","88983568");
	Contact c3=new Contact("Akash","akash@gmail.com","9849646121");
	
	public ContactRepository(){
		contactList=new ArrayList<Contact>();
		contactList.add(c1);
		contactList.add(c2);
		contactList.add(c3);
		
	}
	
	public List<Contact> get(){
		return contactList;
	}
	
	public void addContact(Contact contact) {
		contactList.add(contact);
	}
}
