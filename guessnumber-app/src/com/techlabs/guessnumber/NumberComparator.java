package com.techlabs.guessnumber;

public class NumberComparator {
	NumberGenerator generateNumber=new NumberGenerator();
	 public int checkGuessedNumber(int guessedNumber) {
		if(generateNumber.getNumber()==guessedNumber)
			return 0;
		else if(generateNumber.getNumber()<guessedNumber)
			return 1;
		else
			return -1;
	}
}
