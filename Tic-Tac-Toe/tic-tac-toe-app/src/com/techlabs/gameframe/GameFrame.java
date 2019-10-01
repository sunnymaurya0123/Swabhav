package com.techlabs.gameframe;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.techlabs.business.model.Board;
import com.techlabs.business.model.MarkType;
import com.techlabs.business.model.Player;
import com.techlabs.business.model.ResultAnalyzer;
import com.techlabs.presentation.model.Game;

public class GameFrame extends JFrame{

	private JButton[] cellButtons;
	private JLabel[] labels;
	
	public GameFrame() {
		setTitle("Tic-Tac-Toe");
		setSize(1024, 708);
		getContentPane().setBackground(Color.YELLOW);
		cellButtons=new JButton[9];
		labels=new JLabel[7];
		initializeComponents();
		
		setComponents();
		addComponents();
		setLayout(null);
		setVisible(true);
	}

	private void setComponents() {
		
		cellButtons[0].setBounds(350, 200, 100, 100);
		cellButtons[0].setText("0");
		cellButtons[1].setBounds(450, 200, 100, 100);
		cellButtons[1].setText("1");
		cellButtons[2].setBounds(550, 200, 100, 100);
		cellButtons[2].setText("2");
		cellButtons[3].setBounds(350, 300, 100, 100);
		cellButtons[3].setText("3");
		cellButtons[4].setBounds(450, 300, 100, 100);
		cellButtons[4].setText("4");
		cellButtons[5].setBounds(550, 300, 100, 100);
		cellButtons[5].setText("5");
		cellButtons[6].setBounds(350, 400, 100, 100);
		cellButtons[6].setText("6");
		cellButtons[7].setBounds(450, 400, 100, 100);
		cellButtons[7].setText("7");
		cellButtons[8].setBounds(550, 400, 100, 100);
		cellButtons[8].setText("8");
		
		labels[0].setText("Welcome to TIC-TAC-TOE Game!!!");
		labels[0].setBounds(400, 100, 200, 100);
		labels[1].setText("Current Player: ");
		labels[1].setBounds(750, 100, 100, 100);
		labels[2].setText("Status: ");
		labels[2].setBounds(750, 130, 300, 100);
		
		
		
	}

	private void addComponents() {
		
		for(JButton button:cellButtons)
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
		game.swapPlayers();
		EventHandler handler=new EventHandler(game,frame);
		
		
	}
	
	private void initializeComponents() {
		
		for(int i=0;i<cellButtons.length;i++) {
			cellButtons[i]=new JButton();
			
		}
		
		for(int i=0;i<labels.length;i++)
			labels[i]=new JLabel();
	}
	
	public JButton[] getCellButtons() {
		return cellButtons;
	}

	public JLabel[] getLabels() {
		return labels;
	}
	
	
}