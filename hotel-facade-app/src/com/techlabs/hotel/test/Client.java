package com.techlabs.hotel.test;

import com.techlabs.hotel.HotelKeeper;

public class Client {

	public static void main(String[] args) {
		HotelKeeper keeper=new HotelKeeper();
		System.out.println(keeper.getVegMenu().getMenu());

	}

}
