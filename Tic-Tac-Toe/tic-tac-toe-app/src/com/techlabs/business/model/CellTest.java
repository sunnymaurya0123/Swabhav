package com.techlabs.business.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CellTest {

	Cell[] cell=new Cell[3];
	
	boolean mark;
	@Test
	void testIsEmpty() {
		cell[0]=new Cell();
		cell[0].setMark(MarkType.E);
		mark=cell[0].isEmpty();
		assertEquals(true,mark);
		
		cell[1]=new Cell();
		cell[1].setMark(MarkType.X);
		mark=cell[1].isEmpty();
		assertEquals(false,mark);
		
		cell[2]=new Cell();
		cell[2].setMark(MarkType.O);
		mark=cell[2].isEmpty();
		assertEquals(false,mark);
		
	}
	
	@Test
	void testCheckDuplicateCells() {
		boolean mark=cell[0].checkDuplicateCells();
		assertEquals(false, mark);
	}

}
