package com.techlabs.singleton;

public class SingleObjectCreator {
	private static SingleObjectCreator singleObject;
	
	private SingleObjectCreator() {
		
	}
	
	public static SingleObjectCreator getInstance() {
		if(singleObject==null)
			singleObject=new SingleObjectCreator();
		return singleObject;
	}
	
	public void printMessage() {
		System.out.println("Hello Sunny!!!");
	}
	
}
