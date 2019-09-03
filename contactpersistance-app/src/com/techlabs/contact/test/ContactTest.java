package com.techlabs.contact.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import com.techlabs.contact.Contact;
import com.techlabs.contact.ContactManager;

public class ContactTest {
	final static int ADD_CONTACT=1;
	final static int DISPLAY_CONTACTS=2;
	final static int REMOVE_CONTACT=3;
	static int option=0;
	static boolean b = true;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ArrayList<Contact> contact=ContactManager.retrieve();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Total Number of Contacts: " + contact.size());
		
		while (b) {
			System.out.println("Please select one of the options:" + "\n1. Add Contact" + "\n2. Display Contacts"
								+ "\n3. Remove Contact");
			System.out.println("Do you want to continue? Enter[Y/N]");
			String string=scanner.next();
			string=string.toLowerCase();
			if(string.equals("y")) {
				System.out.println("Please enter the options: ");
				option = scanner.nextInt();
			}
			else
				break;
			
			switch (option) {
			case ADD_CONTACT:
				System.out.println("Please enter the number: ");
				long number = scanner.nextLong();

				System.out.println("Please enter the name: ");
				String name = scanner.next();

				System.out.println("Please enter the email: ");
				String email = scanner.next();

				Contact contact1 = new Contact(number, name, email);
				contact.add(contact1);
				System.out.println("Contact added succesfully");
				System.out.println("Total Number of Contacts: " + contact.size());
				break;

			case DISPLAY_CONTACTS:
				if(contact.size()!=0)
				for (Contact contacts : contact) {
					System.out.println("Contact Number: " + contacts.getContactNumber() + "\nContact Name: "
							+ contacts.getName() + "\nEmail: " + contacts.getEmail_id());
				}
				else
					System.out.println("Contact List is Empty.");
				break;

			case REMOVE_CONTACT:
				if(contact.size()!=0) {
				System.out.println("Enter the contact number to remove");
				long deleteContact = scanner.nextLong();
				for (Contact contacts : contact) {
					if (deleteContact == contacts.getContactNumber()) {
						contact.remove(contacts);
						System.out.println("Contact removed successfully");
						break;
					}
				}
				System.out.println("Please enter the correct phone Number.");
				}
				else
					System.out.println("Contact List is Empty.");
				break;

			default:
				System.out.println("Invalid option");
				break;
			}
		}
		scanner.close();
		ContactManager.save(contact);

	}

}
