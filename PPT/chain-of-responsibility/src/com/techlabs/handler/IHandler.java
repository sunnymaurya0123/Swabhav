package com.techlabs.handler;
import com.techlabs.number.Number;

public interface IHandler {
	void setNext(IHandler handler); 
    void process(Number request);
}
