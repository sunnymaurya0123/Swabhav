package com.techlabs.actions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Contact;
import com.techlabs.service.ContactService;
import com.techlabs.viewmodels.ContactAddViewModel;

public class ContactAddAction extends ActionSupport implements ModelDriven<ContactAddViewModel>{

	private ContactAddViewModel contactAddViewModel;
	@Autowired
	private ContactService contactService;
	private List<Contact> contactList;
	
	public ContactAddAction() {
		System.out.println("Inside ContactAddAction Constructor");
		contactAddViewModel=new ContactAddViewModel();
	}
	
	@Override
	public void validate() {
		System.out.println("Inside validate");
		System.out.println(contactAddViewModel.getName()+""+contactAddViewModel.getEmail()+"");
		if (contactAddViewModel.getName().trim().equals("") || contactAddViewModel.getName()==null)
			addFieldError("name", "name can't be blank.");
		if(contactAddViewModel.getEmail().trim().equals("") || contactAddViewModel.getEmail()==null)
			addFieldError("email", "email can't be blank.");
		if(contactAddViewModel.getPhoneNo().trim().equals("") || contactAddViewModel.getPhoneNo()==null)
			addFieldError("phoneNo", "phoneNo can't be blank.");
	}
	
	@Override
	public ContactAddViewModel getModel() {
		System.out.println("Inside getModel");
		return contactAddViewModel;
	}
	
	public String addContact() {
		contactService.addContact(new Contact(contactAddViewModel.getName(),contactAddViewModel.getEmail(),contactAddViewModel.getPhoneNo()));
		contactList=contactService.get();
		return SUCCESS;
	}
	
	@Override
	public String execute() {
		System.out.println("Inside ContactAddAction execute");
		return this.SUCCESS;
	}

	public List<Contact> getContactList() {
		System.out.println("Inside GetList"+contactList);
		return contactList;
	}
	
	

}
