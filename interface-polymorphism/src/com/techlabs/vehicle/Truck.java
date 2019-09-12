package com.techlabs.vehicle;

import com.techlabs.vehicle.imoveable.IMoveable;

public class Truck implements IMoveable{

	@Override
	public void move() {
		System.out.println("Truck is moving...");
		
	}

}
