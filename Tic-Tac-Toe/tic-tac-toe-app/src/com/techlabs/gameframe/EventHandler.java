package com.techlabs.gameframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import com.techlabs.presentation.model.Game;

public class EventHandler implements ActionListener {

	private GameFrame frame;
	private Game game;

	public EventHandler(Game game, GameFrame frame) {
		this.game = game;
		this.frame = frame;
		for (JButton button : frame.getCellButtons())
			button.addActionListener(this);
		this.frame.getLabels()[3].setText(game.getCurrentPlayer().getName());
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		for (JButton button : frame.getCellButtons())
			if (e.getSource() == button && (!frame.getLabels()[4].getText().equals("WIN") && !frame.getLabels()[4].getText().equals("DRAW"))) {
				try {
						game.play(Integer.parseInt(button.getText()));
				} catch (NumberFormatException ex) {
					System.out.println(ex.getMessage());
				}
				button.setText(game.getCurrentPlayer().getMark().toString());

				frame.getLabels()[3].setText(game.getCurrentPlayer().getName());
				frame.getLabels()[3].setBounds(860, 100, 200, 100);
				frame.getLabels()[4].setText(game.getStatus().toString());
				frame.getLabels()[4].setBounds(860, 130, 200, 100);
				
				if(frame.getLabels()[4].getText().equals("WIN")) {
					frame.getLabels()[5].setText(game.getCurrentPlayer().getName()+" Won the Game!!!");
					frame.getLabels()[5].setBounds(750, 200, 200, 100);
				}
				if(frame.getLabels()[4].getText().equals("DRAW")) {
					frame.getLabels()[6].setText(" Game Over!!!");
					frame.getLabels()[6].setBounds(750, 200, 200, 100);
				}
				frame.add(frame.getLabels()[3]);
				frame.add(frame.getLabels()[4]);
				frame.add(frame.getLabels()[5]);
				frame.add(frame.getLabels()[6]);
			}
	}

}
