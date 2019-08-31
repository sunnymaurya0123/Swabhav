package com.techlabs.contact;

import java.io.*;
import java.util.*;

public class ContactSerialization {
	public void doSerialization(ArrayList<Contact> contact) throws IOException {
		FileOutputStream fileOutputStream=new FileOutputStream("\\Resources\\serializedFile.txt");
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(contact);
		objectOutputStream.close();
	}
	public void doDeserialization() throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream=new FileInputStream("\\Resources\\serializedFile.txt");
		ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
		ArrayList<Contact> contact=(ArrayList<Contact>)objectInputStream.readObject();
		
		objectInputStream.close();
	}
}
