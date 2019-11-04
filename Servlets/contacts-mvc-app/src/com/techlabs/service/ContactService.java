package com.techlabs.service;

import java.util.List;
import com.techlabs.model.Contact;
import com.techlabs.repository.ContactRepository;

public class ContactService {
	
	private static ContactService singleObject;
	ContactRepository contactRepository=new ContactRepository();
	
	private ContactService() {
		System.out.println("Inside Service");
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
	
	public Contact get(int id) {
		return contactRepository.get(id);
	}
	
	public void edit(int id,Contact contact) {
		contactRepository.edit(id, contact);
		
	}

	public void remove(int contactId) {
		contactRepository.remove(contactId);
	}
}
