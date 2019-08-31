package com.techlabs.guessnumber;

public class NumberGenerator {
	private int number;
	
	public NumberGenerator() {
		this.number=(int)(Math.random()*101);
	}
	public int getNumber() {
		return number;
	}
	
}
