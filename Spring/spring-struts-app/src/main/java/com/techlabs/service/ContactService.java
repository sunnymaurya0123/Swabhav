package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Contact;
import com.techlabs.repository.ContactRepository;

@Service
public class ContactService {

	@Autowired
	private ContactRepository contactRepo;
	
	public List<Contact> get(){
		return contactRepo.get();
	}
	
	public void addContact(Contact contact) {
		contactRepo.addContact(contact);
	}
}
