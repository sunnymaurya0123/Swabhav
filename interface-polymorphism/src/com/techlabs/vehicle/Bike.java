package com.techlabs.vehicle;

import com.techlabs.vehicle.imoveable.IMoveable;

public class Bike implements IMoveable{

	@Override
	public void move() {
		System.out.println("Bike is moving...");
		
	}
	
}
