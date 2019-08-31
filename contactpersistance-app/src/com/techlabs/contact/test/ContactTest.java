package com.techlabs.contact.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.techlabs.contact.Contact;
import com.techlabs.contact.ContactSerialization;

public class ContactTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ArrayList<Contact> contactList = new ArrayList<Contact>();
		ContactSerialization contactSerialization=new ContactSerialization();
		Scanner scanner = new Scanner(System.in);

		boolean b = true;
		System.out.println("Total Number of Contacts: " + contactList.size());
		while (b) {
			System.out.println("Please select one of the options:" + "\n1. Add Contact" + "\n2. Display Contacts"
					+ "\n3. Remove Contact");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Please enter the number: ");
				long number = scanner.nextLong();

				System.out.println("Please enter the name: ");
				String name = scanner.next();

				System.out.println("Please enter the email: ");
				String email = scanner.next();

				Contact contact1 = new Contact(number, name, email);
				contactList.add(contact1);
				System.out.println("Contact added succesfully");
				System.out.println("Total Number of Contacts: " + contactList.size());
				break;

			case 2:
				for (Contact contacts : contactList) {
					System.out.println("Contact Number: " + contacts.getContactNumber() + "\nContact Name: "
							+ contacts.getName() + "\nEmail: " + contacts.getEmail_id());
				}
				break;

			case 3:
				System.out.println("Enter the contact number to remove");
				long deleteContact = scanner.nextLong();
				for (Contact contacts : contactList) {
					if (deleteContact == contacts.getContactNumber()) {
						contactList.remove(contacts);
						System.out.println("Contact removed successfully");
					}
				}
				break;

			default:
				System.out.println("Invalid option");
				break;
			}
		}
		scanner.close();
		
		contactSerialization.doSerialization(contactList);
		//contactSerialization.doDeserialization();

	}

}
