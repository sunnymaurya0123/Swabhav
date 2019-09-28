package com.techlabs.case2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class SubscriberOne implements ActionListener {

	Frame frame;

	public SubscriberOne(Frame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(frame.getButton1()))
			frame.getContentPane().setBackground(Color.BLUE);
		if (e.getSource().equals(frame.getButton2()))
			frame.getContentPane().setBackground(Color.GREEN);

	}

}
