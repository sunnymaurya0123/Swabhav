package com.techlabs.inheritance.case2;

public class Child extends Parent {

	public Child() {
		super(100);
		System.out.println("Child");
	}

	public Child(int foo) {
		super(foo);
		System.out.println("Child Overloaded");
	}
	
}
