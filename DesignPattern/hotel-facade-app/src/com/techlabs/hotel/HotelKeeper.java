package com.techlabs.hotel;

public class HotelKeeper {
	VegRestaurent v=new VegRestaurent();
	NonVegRestaurent nv=new NonVegRestaurent();
	
	public String getVegMenu() {
		return v.getMenu();
	}
	
	public String getNonVegMenu() {
		return nv.getMenu();
	}
	
}
