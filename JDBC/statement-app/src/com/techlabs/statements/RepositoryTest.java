package com.techlabs.statements;

import java.util.List;

public class RepositoryTest {
	public static void main(String[] args) {
		ContactRepository contactRepo=new ContactRepository();
		contactRepo.add(new Contact("Sunny","Maurya","sunnygmail.com",989270774));
		List<Contact> contactList=contactRepo.get();
		System.out.println(contactList.size());
//		System.out.println(contactList.get(0));
		
		
//		List<Contact> contactList1=contactRepo.get();
//		System.out.println(contactList1.size());
//		System.out.println(contactList.get(1));
//		contactList.get(0);
	}
}
