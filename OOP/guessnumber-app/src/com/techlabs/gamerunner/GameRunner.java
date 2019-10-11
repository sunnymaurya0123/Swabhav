package com.techlabs.gamerunner;

import java.util.Scanner;
import com.techlabs.game.Game;

public class GameRunner {
	private static final int MATCH = 0;
	private static final int HIGH = 1;
	private static final int LOW = -1;

	public GameRunner() {
		new Game();
	}

	public void start() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int guessedNumber = scanner.nextInt();
		Game game = new Game(guessedNumber);
		switch (game.getResult()) {
		case MATCH:
			System.out.println("Guessed number is matched. you WON!!!");
			break;
		case HIGH:
			System.out.println("Guessed number is high");
			break;
		case LOW:
			System.out.println("Guessed number is low");
			break;
		}
		scanner.close();
	}
}
