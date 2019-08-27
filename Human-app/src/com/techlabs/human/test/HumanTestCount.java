package com.techlabs.human.test;

import com.techlabs.human.GenderCategory;
import com.techlabs.human.Human;

public class HumanTestCount {

	public static void main(String[] args) {
		Human human=new Human("Ganesh",167f,67.5f,23,GenderCategory.FEMALE);
		System.out.println(human.getCount());
		Human human1=new Human("Sunny",21);
		System.out.println(human.getCount());
		Human human2=new Human("Ram",40);
		System.out.println(human.getCount());
		Human human3=new Human("Ganesh",167f,67.5f,23,GenderCategory.FEMALE);
		System.out.println(human.getCount());

	}

}
