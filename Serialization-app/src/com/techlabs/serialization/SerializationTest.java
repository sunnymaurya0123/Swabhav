package com.techlabs.serialization;

import java.io.*;

import com.techlabs.demoproject.SerializeDemo;

public class SerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerializeDemo serializeDemo=new SerializeDemo();
		
		FileOutputStream fileOutputStreamObject=new FileOutputStream("D:\\SwabhavRepository\\Serialization-app\\Resource\\file.txt");
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStreamObject);
		objectOutputStream.writeObject(serializeDemo);
		
		objectOutputStream.close();
		
		FileInputStream fileInputStreamObject=new FileInputStream("D:\\SwabhavRepository\\Serialization-app\\Resource\\file.txt");
		ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStreamObject);
		SerializeDemo serializeDemo1=(SerializeDemo)objectInputStream.readObject();
		objectInputStream.close();
		
		System.out.println(serializeDemo1.getNUMBER());
		System.out.println(serializeDemo1.getName());

	}

}
