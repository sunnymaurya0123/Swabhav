package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Contact;
import com.techlabs.repository.ContactRepository;

public class ContactService {
	
	private static ContactService singleObject;
	ContactRepository contactRepository=new ContactRepository();
	Contact c1=new Contact("Sunny","Maurya","sunny@gmail.com",989270774);
	Contact c2=new Contact("Ravi","Maurya","ravi@gmail.com",88983568);
	
	private ContactService() {
		System.out.println("Inside Service");
		add(c1);
		add(c2);
	}
	
	public static ContactService getInstance() {
		if(singleObject==null)
			singleObject=new ContactService();
		return singleObject;
	}
	
	public List<Contact> get(){
		return contactRepository.get();
	}
	
	public void add(Contact contact) {
		contactRepository.add(contact);
		System.out.println(contactRepository.get().size());
	}
}
