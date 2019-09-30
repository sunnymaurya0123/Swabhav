package com.techlabs.presentation.model;

import com.techlabs.business.model.Board;
import com.techlabs.business.model.Player;
import com.techlabs.business.model.Result;
import com.techlabs.business.model.ResultAnalyzer;

public class Game {

	private Player[] players;
	private Player currentPlayer;
	private Result status;
	private Board board;
	private ResultAnalyzer analyzer;

	public Game(Player[] players, Board board, ResultAnalyzer analyzer) {
		this.players = players;
		currentPlayer = this.players[0];
		this.board = board;
		this.analyzer = analyzer;
		status = analyzer.getResult();
	}

	public void swapPlayers() {
		if (currentPlayer == players[0])
			currentPlayer = players[1];
		else if (currentPlayer == players[1])
			currentPlayer = players[0];
	}

	public void play(int location) {

		if(!board.getCells()[location].checkDuplicateCells()) {
		board.setMarkAtLocation(location, currentPlayer);
		swapPlayers();
		}
		else
			throw new RuntimeException("This cell is already occupied please enter another location!!!");
		analyzer.analyzeResult();
		status = analyzer.getResult();
	}

	public Result getStatus() {
		return status;
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

}
