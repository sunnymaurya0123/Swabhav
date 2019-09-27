package com.techlabs.case2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class SubscriberOne implements IPublisher {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Publisher One");
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.println("Publisher Two");
		
	}

	

}
