package com.techlabs.business.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CellTest2 {

	Cell cell=new Cell();
	@Test
	void testIsEmpty() {

		boolean mark=cell.isEmpty();
		assertEquals(true, mark);
	}

	@Test
	void testCheckDuplicateCells() {
		boolean mark=cell.checkDuplicateCells();
		assertEquals(false, mark);
	}

}
