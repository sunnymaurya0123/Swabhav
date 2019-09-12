package com.techlabs.game;

public class Game {
	private static int number;
	private int result;

	public int getResult() {
		return result;
	}

	public Game() {
		number = (int) (Math.random() * 101);
	}

	public Game(int guessedNumber) {
		result = checkGuessedNumber(guessedNumber);
	}

	private int checkGuessedNumber(int guessedNumber) {
		if (number == guessedNumber)
			return 0;
		else if (number < guessedNumber)
			return 1;
		return -1;
	}

}
