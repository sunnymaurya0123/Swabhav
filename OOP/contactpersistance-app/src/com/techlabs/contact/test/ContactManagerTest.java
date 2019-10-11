package com.techlabs.contact.test;

import java.io.*;
import java.util.*;

import com.techlabs.contact.Contact;
import com.techlabs.contact.ContactManager;

public class ContactManagerTest {

	public static void main(String[] args) throws ClassNotFoundException, IOException  {
		
		ArrayList<Contact> contact=ContactManager.retrieve();
		System.out.println(contact.size());

	}

}
