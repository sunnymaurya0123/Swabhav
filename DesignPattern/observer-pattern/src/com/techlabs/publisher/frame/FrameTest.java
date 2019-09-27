package com.techlabs.publisher.frame;

public class FrameTest {

	public static void main(String[] args) {
		Frame frame=new Frame("Welcome To Frame","Click here",1024,708);
		SubscriberOne sub1=new SubscriberOne();
		frame.registerSubscriber(sub1);
		SubscriberTwo sub2=new SubscriberTwo();
		frame.registerSubscriber(sub2);
		
	}

}