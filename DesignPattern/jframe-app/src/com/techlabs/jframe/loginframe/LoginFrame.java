package com.techlabs.jframe.loginframe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginFrame extends JFrame implements ActionListener{
	private JButton button;
//	private JPanel panel;
	private JDialog dialog;
	private JLabel label;
	private JLabel label1;
	private JTextField field1;
	private JTextField field2;
	
	public LoginFrame() {

		
		initializeNewComponents();
		setTitle("Welcome To Frame");
		setSize(1024, 708);
		getContentPane().setBackground(Color.GREEN);
		setFrameComponents();
		addFrameComponents();
		setLayout(null);
		setVisible(true);
	}

	private void initializeNewComponents() {
		button = new JButton("Login");
//		panel=new JPanel();
		
		label=new JLabel();
		label1=new JLabel();
		field1=new JTextField("Enter Name");
		field2=new JTextField("Enter Password");
		
	}

	private void addFrameComponents() {
		add(button);
		add(label);
		add(label1);
		add(field1);
		add(field2);
//		add(panel);
//		add(dialog);
		
	}

	private void setFrameComponents() {
		setButtonDetails();
		setTextField();
		setLabelField();
//		setPanelDetails();
		
	}

	private void setLabelField() {
		label.setText("Name: ");
		label.setBounds(300, 200, 150, 40);
		label1.setText("Password: ");
		label1.setBounds(300, 250, 150, 40);
	}

	private void setTextField() {
		field1.setBounds(400, 200, 150, 40);
		field2.setBounds(400, 250, 150, 40);
	}

//	private void setPanelDetails() {
//		
//		panel.setSize(1024, 708);
//		panel.add(button);
//	}


	private void setButtonDetails() {
		button.setBackground(Color.YELLOW);
		button.setBounds(400, 300, 150, 40);
		button.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Login")) {
//			setPanelDetails();
			dialog=new JDialog();
			setDialogDetails();
			
		}
	}

	private void setDialogDetails() {
		dialog.setTitle("New Window");
		dialog.setSize(300, 300);
		
		
	}
	
	
}
