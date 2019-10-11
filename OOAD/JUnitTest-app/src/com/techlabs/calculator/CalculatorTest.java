package com.techlabs.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	private int num1 = 2;
	private int num2 = 5;

	@Test
	void testAddFailure() {

		int sum;
		try {
			sum = Calculator.add(-4, -5);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());

		}
		System.out.println("test running");

	}

	@Test
	void testAdd() {
		int total = 7;
		int sum = Calculator.add(num1, num2);
		assertEquals(sum, total);
	}

	@Test
	void testCubeEven() {
		int result = Calculator.cubeEven(2);
		assertEquals(8, result);

	}

	@Test
	void testCubeEvenFailure() {
		int result;
		try {
			result = Calculator.cubeEven(-2);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());

		}
	}

}
