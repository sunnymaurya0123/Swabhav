package com.techlabs.dbdriven.test;

import com.techlabs.dbdriven.CustomerDB;
import com.techlabs.dbdriven.OrderDB;
import com.techlabs.dbdriven.ProductDB;
import com.techlabs.icrud.ICrudable;

public class Test {

	public static void main(String[] args) {
		ICrudable x;
		x=new CustomerDB();
		x.create();
		x=new ProductDB();
		x.create();
		x=new OrderDB();
		x.create();
	}

}
