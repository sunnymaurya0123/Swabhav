package com.techlabs.shoppingcart.unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.shoppingcart.Product;

class ProductTest {

	@Test
	void testCalculateProductCost() {
		Product product=new Product(101,"Book",100,20);
		double itemCost=80.0;
		double result=product.calculateProductCost();
		assertEquals(result,itemCost);
	}
	
//	@Test
//	void testProduct() {
//		Product product=new Product(101,"Book",100,20);
//	}

	

}
