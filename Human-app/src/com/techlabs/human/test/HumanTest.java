package com.techlabs.human.test;

import com.techlabs.bmi.BmiCalculator;
import com.techlabs.human.GenderCategory;
import com.techlabs.human.Human;

public class HumanTest {
	
	static float Bmi;
	public static void main(String[] args) {
		Human human=new Human("Ganesh",167f,67.5f,23,GenderCategory.FEMALE);
		Human human1=new Human("Sunny",21);
		BmiCalculator bmiCalculatorObject=new BmiCalculator();
		human.eat();
		human.play();
		Bmi=bmiCalculatorObject.calculateBMI(human.getWeight(),human.getHeight());
		printInto(human);
		System.out.println(bmiCalculatorObject.printBodyType(Bmi));
		Bmi=bmiCalculatorObject.calculateBMI(human1.getWeight(),human1.getHeight());
		printInto(human1);
		System.out.println(bmiCalculatorObject.printBodyType(Bmi));

	}
	static void printInto(Human human) {
		System.out.println("Name is: "+human.getName()+"\nHeight is: "+human.getHeight()+"\nWeight is: "+human.getWeight()+
				"\nAge is: "+human.getAge()+"\nGender is: "+human.getGender()+"\nBMI is: "+Bmi);
	}

}
