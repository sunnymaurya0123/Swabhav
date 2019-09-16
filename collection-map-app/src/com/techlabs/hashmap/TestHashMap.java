package com.techlabs.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<String,Integer> students=new HashMap<String,Integer>();
		students.put("Sunny", 21);
		students.put("Ravi", 54);
		students.put("Ravi", 56);
		students.put("Dharam", 54);
		//students.replace("Ravi", 23);
		
		//students.remove("Sunny");
		
		//for(Iterator i=students.)
		for(Map.Entry<String, Integer> entry:students.entrySet()) {
			System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
		}

	}

}
