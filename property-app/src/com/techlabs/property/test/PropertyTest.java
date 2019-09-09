package com.techlabs.property.test;

import java.io.IOException;

import com.techlabs.property.LoadPropertyFile;

public class PropertyTest {

	public static void main(String[] args) throws IOException {
		LoadPropertyFile load=new LoadPropertyFile("Resources/message.properties");
		System.out.println(load.getproperties("BankName"));
		System.out.println(load.getproperties("branch"));
	}
	
}
