package com.techlabs.shoppingcart.unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.shoppingcart.LineItem;
import com.techlabs.shoppingcart.Product;

class LineItemTest {

	LineItem lineItem=new LineItem(102,10,new Product(101,"Book",100,20));
	@Test
	void testCalculateItemCost() {
		double itemCost=800;
		double result=lineItem.calculateItemCost();
		assertEquals(itemCost,result);
	}

}
