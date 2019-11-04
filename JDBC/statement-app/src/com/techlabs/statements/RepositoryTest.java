package com.techlabs.statements;

import java.util.List;

public class RepositoryTest {
	public static void main(String[] args) {
		ContactRepository contactRepo=new ContactRepository();
		contactRepo.add(new Contact("Sunny","Maurya","sunnygmail.com",989270774));
		List<Contact> contactList=contactRepo.get();
		System.out.println(contactList.size());
	}
}
