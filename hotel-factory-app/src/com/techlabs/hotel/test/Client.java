package com.techlabs.hotel.test;

import com.techlabs.hotel.HotelKeeper;
import com.techlabs.hotel.NonVegRestaurent;
import com.techlabs.hotel.VegRestaurent;

public class Client {

	public static void main(String[] args) {
		HotelKeeper keeper=new HotelKeeper();
		VegRestaurent v=keeper.getVegRestaurent();
		NonVegRestaurent nv=keeper.getNonVegRestaurent();
	}

}
