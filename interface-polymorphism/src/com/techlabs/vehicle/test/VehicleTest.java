package com.techlabs.vehicle.test;

import com.techlabs.vehicle.Bike;
import com.techlabs.vehicle.Car;
import com.techlabs.vehicle.Truck;
import com.techlabs.vehicle.imoveable.IMoveable;

public class VehicleTest {

	public static void main(String[] args) {
		Truck truck = new Truck();
		Car car = new Car();
		Bike bike = new Bike();

		IMoveable[] moveable = { truck, car, bike };
		startRace(moveable);

		startRace(truck);
		startRace(car);
		startRace(bike);

	}

	static void startRace(IMoveable obj) {
		obj.move();
	}

	static void startRace(IMoveable[] moveable) {
		System.out.println("Start Racing");
		for (IMoveable movingVehicle : moveable)
			movingVehicle.move();
		System.out.println("Stop Racing\n");
	}

}
