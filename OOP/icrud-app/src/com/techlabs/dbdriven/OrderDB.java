package com.techlabs.dbdriven;

import com.techlabs.icrud.ICrudable;

public class OrderDB implements ICrudable{

	@Override
	public void create() {
		System.out.println("OrderDB created");
		
	}

	@Override
	public void read() {
		System.out.println("OrderDB readed");
		
	}

	@Override
	public void update() {
		System.out.println("OrderDB updated");
		
	}

	@Override
	public void delete() {
		System.out.println("OrderDB deleted");
		
	}

}
