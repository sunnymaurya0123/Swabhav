package com.techlabs.hotel;

public class NonVegRestaurent implements IHotel{

	@Override
	public String getMenu() {
		return "Chicken Rice"+"\nChicken Biryani"+"\nShwarma"+"\nChicken Noodles";
	}

}
