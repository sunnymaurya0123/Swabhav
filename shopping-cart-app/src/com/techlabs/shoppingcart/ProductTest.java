package com.techlabs.shoppingcart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductTest {

	Product product =new Product(101,"Book",100,20);
	@Test
	void testCalculateProductCost() {
		
		double newPrice=79.99999970197678;
		double result=product.calculateProductCost();
		assertEquals(newPrice,result);
	}

}
