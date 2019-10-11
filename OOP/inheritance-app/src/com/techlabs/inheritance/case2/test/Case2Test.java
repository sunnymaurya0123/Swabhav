package com.techlabs.inheritance.case2.test;

import com.techlabs.inheritance.case2.Child;

public class Case2Test {

	public static void main(String[] args) {
		Child c1;
		c1=new Child();
		System.out.println(c1.getFoo());
		Child c2;
		c2=new Child();
		System.out.println(c2.getFoo());
		Child c3;
		c3=new Child(50);
		System.out.println(c3.getFoo());
	}

}
