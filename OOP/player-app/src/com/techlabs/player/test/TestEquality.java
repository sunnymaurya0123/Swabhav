package com.techlabs.player.test;

import com.techlabs.player.Player;

public class TestEquality {

	public static void main(String[] args) {
		Player player1=new Player(101,"Sachin",50);
		Player player2=new Player(101,"Sachin",50);
		Player player3=player1;
		System.out.println(player1==player1);
		System.out.println(player1==player2);
		System.out.println(player1.equals(player1));
		player2=player1;
		System.out.println(player1.equals(player2));
		
//		System.out.println(player1==player3);
//		System.out.println(player1.equals(player3));
		

	}

}
