package com.techlabs.bug;

public class RuntimeExceptionPropogationTest {

	public static void main(String[] args) {
		try {
		m1();
		} catch(RuntimeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("End of Main");

	}

	private static void m1() {
		System.out.println("Inside m1()");
		m2();
		
	}

	private static void m2() {
		System.out.println("Inside m2()");
		m3();
		
	}

	private static void m3() {
		System.out.println("Inside m1()");
		throw new RuntimeException("Something is wrong in m3()");
	}

}
