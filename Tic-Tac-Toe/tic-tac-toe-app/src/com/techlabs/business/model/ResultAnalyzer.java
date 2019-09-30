package com.techlabs.business.model;

public class ResultAnalyzer {
	private Board board;
	private Result result;
	int i = 0;

	public ResultAnalyzer(Board board) {
		this.board = board;
		result=Result.PROGRESS;
	}

	public void analyzeResult() {

		getRowResult();
		getColumnResult();
		getDiagonal1Result();
		getDiagonal2Result();
		getDrawResult();

	}

	public void getDiagonal2Result() {
		
		if ( !board.getCells()[i+2].getMark().equals(MarkType.E) && board.getCells()[i + 2].getMark().equals(board.getCells()[i + 4].getMark())
				&& board.getCells()[i + 4].getMark().equals(board.getCells()[i + 6].getMark()))
			result = Result.WIN;
	}

	public void getDiagonal1Result() {
		if (!board.getCells()[i].getMark().equals(MarkType.E) && board.getCells()[i].getMark().equals(board.getCells()[i + 4].getMark())
				&& board.getCells()[i + 4].getMark().equals(board.getCells()[i + 8].getMark()))
			result = Result.WIN;
	}

	public void getColumnResult() {
		while (i != 3) {
			if (!board.getCells()[i].getMark().equals(MarkType.E) && board.getCells()[i].getMark().equals(board.getCells()[i + 3].getMark())
					&& board.getCells()[i + 3].getMark().equals(board.getCells()[i + 6].getMark()))
				result = Result.WIN;
			i+=1;
		}
		i = 0;
	}

	public void getRowResult() {
		while (i != 9) {
			if (!board.getCells()[i].getMark().equals(MarkType.E) && board.getCells()[i].getMark().equals(board.getCells()[i+1].getMark())
					&& board.getCells()[i+1].getMark().equals(board.getCells()[i+2].getMark()))
				result = Result.WIN;
			i+=3;
		}
		i = 0;
	}
	
	public void getDrawResult() {
		if(!board.isEmpty() && result.equals(Result.PROGRESS))
			result=Result.DRAW;
	}

	public Result getResult() {
		return result;
	}
	
	

}
