package com.techlabs.contactui;

import java.util.ArrayList;
import java.util.Scanner;

import com.techlabs.contact.Contact;

public class ContactUI {
	private final static int ADD_CONTACT=1;
	private final static int DISPLAY_CONTACTS=2;
	private final static int REMOVE_CONTACT=3;
	public void start() {
		ArrayList<Contact> contactList = new ArrayList<Contact>();

		Scanner scanner = new Scanner(System.in);

		boolean b = true;
		System.out.println("Total Number of Contacts: " + contactList.size());
		while (b) {
			System.out.println("Please select one of the options:" + "\n1. Add Contact" + "\n2. Display Contacts"
					+ "\n3. Remove Contact");
			int choice = scanner.nextInt();
			switch (choice) {
			case ADD_CONTACT:
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

			case DISPLAY_CONTACTS:
				for (Contact contacts : contactList) {
					System.out.println("Contact Number: " + contacts.getContactNumber() + "\nContact Name: "
							+ contacts.getName() + "\nEmail: " + contacts.getEmail_id());
				}
				break;

			case REMOVE_CONTACT:
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

	}
}
