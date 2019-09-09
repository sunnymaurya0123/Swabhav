package com.techlabs.reflection.test;
import com.techlabs.reflection.*;
public class Test2 {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("entered");
		Reflection1 reflection1=new Reflection1(System.class);
		reflection1.printMethods();
		reflection1.printConstructors();
		reflection1.printInto();
	}

}
