package com.techlabs.guitar;

public class Guitar {
	private String serialNumber;
	private double price;
	private GuitarSpec spec;

	public Guitar(String serialNumber,double price,GuitarSpec spec) {
		this.serialNumber=serialNumber;
		this.price=price;
		this.spec=spec;
	}
	
//	public Guitar(String serialNumber2, double price2, String model, int numStrings, Builder builder, Type type,
//			Wood backWood, Wood topWood) {
//		this.serialNumber=serialNumber;
//		this.price=price;
//		this.model=nodel;
//		this.numStrings=numStrings;
//		this.builder=builder;
//		this.type=type;
//		this.backWood=backWood;
//		this.topWood=topWood;
//	}



	public GuitarSpec getSpec() {
		return spec;
	}

	public double getPrice() {
		this.price=price;
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

}
