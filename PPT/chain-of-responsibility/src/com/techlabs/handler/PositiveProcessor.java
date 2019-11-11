package com.techlabs.handler;

import com.techlabs.number.Number;

public class PositiveProcessor implements IHandler {

	private IHandler nextHandler;

	public void setNext(IHandler handler) {
		nextHandler = handler;
	}

	public void process(Number request) {

		if (request.getNumber() > 0)
			System.out.println("PositiveProcessor : " + request.getNumber());
		else
			nextHandler.process(request);
	}
}
