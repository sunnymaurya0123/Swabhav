package com.techlabs.human;

import com.techlabs.interfaces.IMannerable;

public class Man implements IMannerable{

	@Override
	public void wish() {
		System.out.println("Hello Man");
		
	}

	@Override
	public void depart() {
		System.out.println("Good Bye Man");
		
	}

}
