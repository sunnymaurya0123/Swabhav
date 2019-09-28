package com.techlabs.business.model.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.business.model.Board;
import com.techlabs.business.model.Cell;

class BoardTest {
	
	Board board=new Board();
	@Test
	void testIsEmpty() {
		boolean mark=board.isEmpty();
		assertEquals(true,mark);
	}

}
