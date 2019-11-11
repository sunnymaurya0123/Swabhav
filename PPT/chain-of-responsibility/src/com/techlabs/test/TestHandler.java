package com.techlabs.test;

import com.techlabs.handler.IHandler;
import com.techlabs.number.Number;
import com.techlabs.handler.NegativeProcessor;
import com.techlabs.handler.PositiveProcessor;
import com.techlabs.handler.ZeroProcessor;

public class TestHandler {
	public static void main(String[] args) { 
        //configure Chain of Responsibility 
        IHandler h1 = new NegativeProcessor(); 
        IHandler h2 = new ZeroProcessor(); 
        IHandler h3 = new PositiveProcessor(); 
        h1.setNext(h2); 
        h2.setNext(h3); 
  
        //calling chain of responsibility 
        h1.process(new Number(90)); 
        h1.process(new Number(-50)); 
        h1.process(new Number(0)); 
        h1.process(new Number(91)); 
    }
}
