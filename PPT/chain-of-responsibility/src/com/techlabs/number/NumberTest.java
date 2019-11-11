package com.techlabs.number;

public class NumberTest {

	public static void main(String[] args) {
		Number number = new Number(-90);
		if (number.getNumber() < 0)
			System.out.println("NegativeProcessor : " + number.getNumber());
		else if (number.getNumber() == 0)
			System.out.println("ZeroProcessor : " + number.getNumber());
		else if (number.getNumber() > 0)
			System.out.println("PositiveProcessor : " + number.getNumber());
		else
			System.out.println("Not a valid number");
	}

}
