package com.techlabs.publisher.frame;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends JFrame{
	
	private JButton button;
	
	
	public Frame(String title,String buttonName,int width,int height){
		button= new JButton(buttonName);
		setTitle(title);
		setSize(width, height);
		getContentPane().setBackground(Color.GREEN);
		setButtonDetails();
		add(button);
		setLayout(null);
		setVisible(true);
		
	}

	public void registerSubscriber(ActionListener observable) {
		button.addActionListener(observable);
		
	}
	
	public void setButtonDetails() {
		button.setBackground(Color.CYAN);
		button.setBounds(400, 300, 100, 100);
	}

}
