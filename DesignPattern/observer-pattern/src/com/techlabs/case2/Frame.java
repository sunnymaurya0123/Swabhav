package com.techlabs.case2;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends JFrame{
	
	private JButton button1;
	private JButton button2;
	
	public Frame(String title,String button1Name,String button2Name,int width,int height){
		button1= new JButton(button1Name);
		button2=new JButton(button2Name);
		setTitle(title);
		setSize(width, height);
		getContentPane().setBackground(Color.GREEN);
		setButtonDetails();
		add(button1);
		add(button2);
		setLayout(null);
		setVisible(true);
		
	}

	public void registerSubscriber(IPublisher publisher) {
		button1.addActionListener(publisher);
		button2.addItemListener(publisher);
		
	}
	
	public void setButtonDetails() {
		button1.setBackground(Color.CYAN);
		button1.setBounds(400, 300, 100, 100);
		button2.setBackground(Color.YELLOW);
		button2.setBounds(500, 500, 100, 100);
	}

}
