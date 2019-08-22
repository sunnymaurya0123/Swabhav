package com.techlabs.basic;

public class ArgumentsTest {

	public static void main(String[] names) {
		if (names.length != 0) {

			for (String name : names)
				System.out.println("Hello " + name);
		} else
			System.out.println("Please pass the arguments");
		System.out.println(names.length);

	}

}
