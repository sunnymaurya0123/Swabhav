package com.techlabs.case2;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends JFrame {

	private JButton button1;
	private JButton button2;

	public Frame(String title, String button1Name, String button2Name, int width, int height) {

		button1 = new JButton(button1Name);
		button2 = new JButton(button2Name);
		setTitle(title);
		setSize(width, height);
		getContentPane().setBackground(Color.GREEN);
		setButtonDetails();
		add(button1);
		add(button2);
		setLayout(null);
		setVisible(true);
	}

	public void registerSubscriber(SubscriberOne sub1) {
		button1.addActionListener(sub1);
		button2.addActionListener(sub1);
	}

	public void setButtonDetails() {
		button1.setBackground(Color.RED);
		button1.setBounds(400, 100, 200, 100);
		button2.setBackground(Color.YELLOW);
		button2.setBounds(100, 100, 200, 100);
	}

	public JButton getButton1() {
		return button1;
	}

	public JButton getButton2() {
		return button2;
	}

}