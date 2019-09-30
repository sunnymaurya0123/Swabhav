package com.techlabs.gameframe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.techlabs.business.model.Board;
import com.techlabs.business.model.Cell;
import com.techlabs.business.model.MarkType;
import com.techlabs.business.model.Player;
import com.techlabs.business.model.Result;
import com.techlabs.business.model.ResultAnalyzer;
import com.techlabs.presentation.model.Game;

public class GameFrame extends JFrame implements ActionListener{

	private static JButton[] buttons;
	private static JLabel[] labels;
	private static int n;
	
	public GameFrame() {
		setTitle("Tic-Tac-Toe");
		setSize(1024, 708);
		getContentPane().setBackground(Color.YELLOW);
		buttons=new JButton[9];
		labels=new JLabel[4];
		initializeComponents();
		
		setComponents();
		addComponents();
		setLayout(null);
		setVisible(true);
	}

	private void setComponents() {
		
		buttons[0].setBounds(350, 200, 100, 100);
		buttons[0].setText("0");
		buttons[1].setBounds(450, 200, 100, 100);
		buttons[1].setText("1");
		buttons[2].setBounds(550, 200, 100, 100);
		buttons[2].setText("2");
		buttons[3].setBounds(350, 300, 100, 100);
		buttons[3].setText("3");
		buttons[4].setBounds(450, 300, 100, 100);
		buttons[4].setText("4");
		buttons[5].setBounds(550, 300, 100, 100);
		buttons[5].setText("5");
		buttons[6].setBounds(350, 400, 100, 100);
		buttons[6].setText("6");
		buttons[7].setBounds(450, 400, 100, 100);
		buttons[7].setText("7");
		buttons[8].setBounds(550, 400, 100, 100);
		buttons[8].setText("8");
		
		labels[0].setText("Welcome to TIC-TAC-TOE Game!!!");
		labels[0].setBounds(400, 100, 200, 100);
		labels[1].setText("Current Player: ");
		labels[1].setBounds(750, 100, 100, 100);
		labels[2].setText("Status: ");
		labels[2].setBounds(750, 130, 300, 100);
		
		
		
	}

	private void addComponents() {
		
		for(JButton button:buttons)
			add(button);
		for(JLabel label:labels)
			add(label);
		
	}

	public static void main(String[] args) {
		GameFrame frame=new GameFrame();
		Player[] players = new Player[2];
		players[0] = new Player("Sunny", MarkType.X);
		players[1] = new Player("Maurya", MarkType.O);

		Board board = new Board();
		ResultAnalyzer analyzer = new ResultAnalyzer(board);

		Game game = new Game(players, board, analyzer);
		
		while (!game.getStatus().equals(Result.WIN) && !game.getStatus().equals(Result.DRAW)) {
			System.out.println(game.getCurrentPlayer().getName() + " please Enter location: ");
			try {
				game.play(1);
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}
		game.swapPlayers();
		
		labels[3].setText(game.getCurrentPlayer().getName());
		labels[3].setBounds(860, 100, 200, 100);
		frame.add(labels[3]);
	}
	
	private void initializeComponents() {
		
		for(int i=0;i<buttons.length;i++) {
			buttons[i]=new JButton();
			buttons[i].addActionListener(this);
		}
		
		for(int i=0;i<labels.length;i++)
			labels[i]=new JLabel();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(JButton button:buttons)
			if(e.getSource()==button)
				n=Integer.parseInt(button.getText());
	}
}
