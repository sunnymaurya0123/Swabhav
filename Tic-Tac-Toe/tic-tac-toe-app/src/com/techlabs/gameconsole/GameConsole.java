package com.techlabs.gameconsole;

import java.util.Scanner;

import com.techlabs.business.model.Board;
import com.techlabs.business.model.MarkType;
import com.techlabs.business.model.Player;
import com.techlabs.business.model.Result;
import com.techlabs.business.model.ResultAnalyzer;
import com.techlabs.presentation.model.Game;

public class GameConsole {

	public static void main(String[] args) {
		
		System.out.println("Welcome to  TIC-TAC-TOE Game!!!");
		int n = 0;
		Scanner scanner = new Scanner(System.in);

		Player[] players = new Player[2];
		players[0] = new Player("Sunny", MarkType.X);
		players[1] = new Player("Maurya", MarkType.O);

		Board board = new Board();
		ResultAnalyzer analyzer = new ResultAnalyzer(board);

		Game game = new Game(players, board, analyzer);

		display(board);
		while (!game.getStatus().equals(Result.WIN) && !game.getStatus().equals(Result.DRAW)) {
			System.out.println(game.getCurrentPlayer().getName() + " please Enter location: ");
			n = scanner.nextInt();
			try {
				game.play(n);
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
			display(board);
		}
		game.swapPlayers();
		if (game.getStatus().equals(Result.WIN))
			System.out.println(game.getCurrentPlayer().getName() + " Won the Game!!! ");
		if (game.getStatus().equals(Result.DRAW))
			System.out.println("Match is Draw!!!");
		System.out.println("Game Over!!!");

	}

	private static void display(Board board) {

		for (int i = 0; i < board.getCells().length;) {
			System.out.println(board.getCells()[i].getMark() + "  " + board.getCells()[i + 1].getMark() + "  "
					+ board.getCells()[i + 2].getMark() + "  ");
			System.out.println("-------");
			i += 3;
		}
	}

}
