package com.techlabs.demoproject;

import java.io.Serializable;

public class SerializeDemo implements Serializable {
	private final int NUMBER=10;
	private String name;
	
	public SerializeDemo() {
		this.name="Sunny";
	}
	
	public String getName() {
		return name;
	}
	
	public int getNUMBER() {
		return NUMBER;
	}

}
