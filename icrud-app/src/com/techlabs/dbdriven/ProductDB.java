package com.techlabs.dbdriven;

import com.techlabs.icrud.ICrudable;

public class ProductDB implements ICrudable{

	@Override
	public void create() {
		System.out.println("ProductDB created");
		
	}

	@Override
	public void read() {
		System.out.println("ProductDB readed");
		
	}

	@Override
	public void update() {
		System.out.println("ProductDB updated");
		
	}

	@Override
	public void delete() {
		System.out.println("ProductDB deleted");
		
	}

}
