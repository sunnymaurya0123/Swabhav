package com.techlabs.singleton.test;

import com.techlabs.singleton.SingleObjectCreator;

public class SingletonTest {

	public static void main(String[] args) {
		SingleObjectCreator singleObject=SingleObjectCreator.getInstance();
		singleObject.printMessage();
		System.out.println(singleObject.hashCode());
		SingleObjectCreator singleObject1=SingleObjectCreator.getInstance();
		System.out.println(singleObject1.hashCode());

	}

}
