package com.techlabs.shoppingcart.unittest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.techlabs.shoppingcart.Customer;
import com.techlabs.shoppingcart.Order;

class CustomerTest {

	Customer customer=new Customer(101,"Sunny");
	@Test
	void testCustomer() {
		Customer customer=new Customer(102,"Ravi");
		assertTrue(customer.getId()==102);
		assertTrue(customer.getName().equals("Ravi"));
	}

	@Test
	void testAddOrder() {
		int size=1;
		Order order=new Order(103,"14/2/2019");
		customer.addOrder(order);
		assertEquals(size,customer.getOrderCount());
		//assertEquals(customer.getOrders().size(),size);
	}

	@Test
	void testGetOrderCount() {
		for(Order order:customer.getOrders())
			assertTrue(order.getId()==103);
	}

}
