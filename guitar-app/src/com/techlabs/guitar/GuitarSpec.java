package com.techlabs.guitar;

import com.techlabs.enums.Builder;
import com.techlabs.enums.Type;
import com.techlabs.enums.Wood;

public class GuitarSpec {
	private String model;
	private Type type;
	private Builder builder;
	private Wood backWood;
	private Wood topWood;

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
