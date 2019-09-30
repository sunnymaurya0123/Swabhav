package com.techlabs.business.model;

public class Cell {
	private MarkType mark;
	
	
	public Cell() {
		mark=MarkType.E;
	}

	public boolean isEmpty() {
		if(mark.equals(MarkType.E))
			return true;
		return false;
	}

	public MarkType getMark() {
		return mark;
	}

	public void setMark(MarkType mark) {
		this.mark = mark;
	}
	
	public boolean checkDuplicateCells(){
		
		if(!isEmpty()) 
			return true;
		
		return false;
		
	}
	
}
