package com.techlabs.human.test;

import com.techlabs.human.Boy;
import com.techlabs.human.Man;
import com.techlabs.interfaces.IEmotionable;
import com.techlabs.interfaces.IMannerable;

public class Test {

	public static void main(String[] args) {
		Man x=new Man();
		Boy y=new Boy();
		
		atThePartyHall(x);
		atThePartyHall(y);
		//atTheMovieHall(x);
		atTheMovieHall(y);

	}

	private static void atTheMovieHall(IEmotionable obj) {
		System.out.println("At The Movie");
		obj.cry();
		obj.laugh();
		
	}

	private static void atThePartyHall(IMannerable obj) {
		System.out.println("At The Party");
		obj.wish();
		obj.depart();
	}
	
	

}
