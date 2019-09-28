package com.techlabs.business.model;

public class Board {
	private Cell[] cells=new Cell[9];
	
	public Board() {
		initializeCells();
	}
	
	private void initializeCells() {
		for(int i=0;i<cells.length;i++)
			cells[i]=new Cell();
//		for(Cell cell:cells)
//			cell=new Cell();
		
	}

	public boolean isEmpty() {
		for(Cell cell:cells)
			if(cell.getMark().equals(MarkType.E)) {
				setMarkAtLocation();
				return true;
			}
			else 
				continue;
		return false;
	}

	private void setMarkAtLocation() {
		
		
	}
}
