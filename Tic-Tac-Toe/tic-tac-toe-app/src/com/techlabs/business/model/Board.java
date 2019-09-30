package com.techlabs.business.model;

public class Board {
	private Cell[] cells=new Cell[9];
	
	public Board() {
		initializeCells();
	}
	
	private void initializeCells() {
		for(int i=0;i<cells.length;i++)
			cells[i]=new Cell();
	}

	public boolean isEmpty() {
		for(Cell cell:cells)
			if(cell.isEmpty())
				return true;
			else 
				continue;
		return false;
	}

	public void setMarkAtLocation(int location,Player player) {
		try {
			cells[location].setMark(player.getMark());
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public Cell[] getCells() {
		return cells;
	}
	
}
