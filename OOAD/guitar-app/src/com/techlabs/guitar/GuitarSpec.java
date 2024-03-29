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
	private int numStrings;

	public GuitarSpec(Builder builder, String model, Type type, int numStrings,Wood backWood, Wood topWood) {
		this.builder=builder;
		this.model=model;
		this.type=type;
		this.backWood=backWood;
		this.topWood=topWood;
		this.numStrings=numStrings;
	}

	public int getNumStrings() {
		return numStrings;
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

	public boolean matches(GuitarSpec otherSpec) {
		if(builder!=otherSpec.builder)
			return false;
		if((model!=null)&&(!model.equals(""))&&(!model.equals(otherSpec.model)))
			return false;
		if(type!=otherSpec.type)
			return false;
		if(numStrings!=otherSpec.numStrings)
			return false;
		if(backWood!=otherSpec.backWood)
			return false;
		if(topWood!=otherSpec.topWood)
			return false;
		return true;
	}

}
