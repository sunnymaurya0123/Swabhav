package com.techlabs.shoppingcart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.shoppingcart.Product;

class LineItemTest {

	LineItem lineItem=new LineItem(102,10,new Product(101,"Book",100,20));
	@Test
	void testCalculateItemCost() {
		double itemCost=1000;
		double result=lineItem.calculateItemCost();
		assertEquals(itemCost,result);
	}

}
