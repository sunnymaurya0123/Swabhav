package com.techlabs.dbdriven;

import com.techlabs.icrud.ICrudable;

public class CustomerDB implements ICrudable {

	@Override
	public void create() {
		System.out.println("CustomerDB created");
		
	}

	@Override
	public void read() {
		System.out.println("CustomerDB readed");
		
	}

	@Override
	public void update() {
		System.out.println("CustomerDB updated");
		
	}

	@Override
	public void delete() {
		System.out.println("CustomerDB deleted");
		
	}
	
}
