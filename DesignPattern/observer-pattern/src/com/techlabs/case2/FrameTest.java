package com.techlabs.case2;

public class FrameTest {

	public static void main(String[] args) {
		Frame frame=new Frame("Welcome To Frame","Click button1","Click button2",1024,708);
		SubscriberOne sub1=new SubscriberOne();
		frame.registerSubscriber(sub1);
		
		
	}

}