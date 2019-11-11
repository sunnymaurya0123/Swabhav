package com.techlabs.handler;

import com.techlabs.number.Number;

public class ZeroProcessor implements IHandler {

	private IHandler nextHandler;

	public void setNext(IHandler handler) {
		nextHandler = handler;
	}

	public void process(Number request) {

		if (request.getNumber() == 0)
			System.out.println("ZeroProcessor : " + request.getNumber());
		else
			nextHandler.process(request);

	}
}
