package com.techlabs.inheritance.case2;

public class Parent {
	
	private int foo;
	
	public Parent(int foo) {
		this.foo=foo;
		System.out.println("Parent");
	}
	
	public int getFoo() {
		return foo;
	}
	
}
