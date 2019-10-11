package com.techlabs.hotel;

public class HotelKeeper {
	VegRestaurent v=new VegRestaurent();
	NonVegRestaurent nv=new NonVegRestaurent();
	
	public VegRestaurent getVegRestaurent() {
		return v;
	}
	
	public NonVegRestaurent getNonVegRestaurent() {
		return nv;
	}
	
}
