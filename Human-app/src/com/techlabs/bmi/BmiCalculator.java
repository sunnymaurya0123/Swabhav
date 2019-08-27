package com.techlabs.bmi;

public class BmiCalculator {
	
	private final float MAX_RANGE=25.0f;
	private final float MIN_RANGE=18.5f;
	
	public float calculateBMI(float weight, float height) {
		height=height/100;
		float Bmi=weight/(height*height);
		return Bmi;
	}
	
	public String printBodyType(float Bmi) {
		if(Bmi>MAX_RANGE)
			return "Overweight";
		else if(Bmi<MIN_RANGE)
			return "Underweight";
		else if(Bmi>=MIN_RANGE && Bmi<=MAX_RANGE)
			return "Normal";
		return "";
}
}