package com.techlabs.abstracts.test;

class Parent {
	void occupation() {
		System.out.println("Business Man");
	}
}

abstract class Child extends Parent {
	@Override
	void occupation() {
		System.out.println("Aurion Pro Employee");
	}

	abstract void future();
}

class Predictor extends Child {

	@Override
	void future() {
		System.out.println("Aurion Pro CEO");

	}

}

public class AbstractTest {

	public static void main(String[] args) {
		Predictor predictor = new Predictor();
		predictor.future();
		predictor.occupation();

	}

}
