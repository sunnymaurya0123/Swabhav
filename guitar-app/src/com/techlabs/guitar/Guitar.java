package com.techlabs.guitar;

import com.techlabs.enums.*;

public class Guitar {
	private String serialNumber;
	private double price;
	private String model;
	private Type type;
	private Builder builder;
	private Wood backWood;
	private Wood topWood;
	private GuitarSpec spec;

	public GuitarSpec getSpec() {
		return spec;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Builder getBuilder() {
		return builder;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}
}
