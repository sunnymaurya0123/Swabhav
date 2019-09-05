package com.techlabs.player.test;

import com.techlabs.player.Player;

public class PlayerTest {

	public static void main(String[] args) {
		Player player1=new Player(101,"Sachin",50);
		Player player2=new Player(102,"virat");
		Player elder=player1.whoIsElder(player2);
		//printInto(player1);
		printInto(elder);
		

	}
	
	
	
	static void printInto(Player player) {
		System.out.println("Player's Id: "+player.getId()+"\nPlayer's Name: "+player.getName()+
				"\nPlayer's Age: "+player.getAge()+"\nPlayer's Hashcode: "+player.hashCode()+"Elder"+player.getElder());
	}

}
