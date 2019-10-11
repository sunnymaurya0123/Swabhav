package com.techlabs.contact;

import java.io.*;
import java.util.*;

public class ContactManager {
	
	public static void save(ArrayList<Contact> contact) throws IOException {

		FileOutputStream fileOutputStream=new FileOutputStream("Resources\\serializedFile.txt");
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(contact);
		objectOutputStream.close();
	}
	public static ArrayList<Contact> retrieve() throws IOException, ClassNotFoundException {
		
		File file=new File("Resources\\serializedFile.txt");
		ArrayList<Contact> contact=new ArrayList<Contact>();
		if(file.exists()) {
			FileInputStream fileInputStream=new FileInputStream(file);
			ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
			contact=(ArrayList<Contact>)objectInputStream.readObject();
			objectInputStream.close();
			return contact;
		}
		return contact;
		
	}
	
}
