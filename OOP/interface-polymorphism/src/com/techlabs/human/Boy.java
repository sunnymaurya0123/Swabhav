package com.techlabs.human;

import com.techlabs.interfaces.IEmotionable;
import com.techlabs.interfaces.IMannerable;

public class Boy implements IEmotionable,IMannerable{

	@Override
	public void cry() {
		System.out.println("Boy cries");
		
	}

	@Override
	public void laugh() {
		System.out.println("Boy laughs");
		
	}

	@Override
	public void wish() {
		System.out.println("Hello Boy");
		
	}

	@Override
	public void depart() {
		System.out.println("Good Bye Boy");
		
	}

}
