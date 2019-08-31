package com.techlabs.guessnumber.test;

import java.util.Scanner;

import com.techlabs.guessnumber.NumberComparator;

public class GuessNumberTest {
	
	public static void main(String[] args) {
		
		NumberComparator checkNumber=new NumberComparator();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int guessedNumber=scanner.nextInt();
		int b=checkNumber.checkGuessedNumber(guessedNumber);
		switch(b) {
		case 0: System.out.println("Guessed number is matched. you WON!!!");
				break;
		case 1: System.out.println("Guessed number is high");
				break;
		case -1: System.out.println("Guessed number is low");
				break;
		}
		scanner.close();
		
	}

	

}
