package com.techlabs.shoppingcart.unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.techlabs.shoppingcart.LineItem;
import com.techlabs.shoppingcart.Order;
import com.techlabs.shoppingcart.Product;

class OrderTest {

	Order order=new Order(101,"12/08/2019");
	@Test
	void testOrder() {
		Order order=new Order(102,"12/08/2020");
		assertTrue(order.getId()==102);
		assertTrue(order.getDate().equals("12/08/2020"));
	}
	
	@Test
	void testAdd() {
		int size=1;
		LineItem lineItem=new LineItem(102,10,new Product(101,"Book",100,20));
		order.add(lineItem);
		assertEquals(order.getItems().size(),size);
	}

	@Test
	void testGetItems() {
		for(LineItem lineItem:order.getItems()) 
			assertEquals(lineItem.getId(),102);
	}

}
