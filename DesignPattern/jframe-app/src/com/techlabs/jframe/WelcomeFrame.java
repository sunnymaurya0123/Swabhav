package com.techlabs.jframe;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WelcomeFrame {
	public WelcomeFrame() {
		JFrame frame=new JFrame("Welcome to JFrame");
		frame.setSize(1024, 708);
		frame.getContentPane().setBackground(Color.GREEN);
		JButton button = new JButton("Hello");
		button.setBackground(Color.CYAN);
		button.setBounds(100, 100, 100, 100);
		frame.add(button);
		frame.setLayout(null);
		JButton button1 = new JButton("Button");
		button1.setBackground(Color.yellow);
		button1.setBounds(500, 200, 100, 100);
		frame.add(button1);
		frame.setVisible(true);
	}
}