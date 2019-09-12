package com.techlabs.vehicle;

import com.techlabs.vehicle.imoveable.IMoveable;

public class Car implements IMoveable{

	@Override
	public void move() {
		System.out.println("Car is moving...");
		
	}

}
