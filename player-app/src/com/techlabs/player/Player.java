package com.techlabs.player;

public class Player {
	private int id;
	private String name;
	private int age;
	private int elder;
	
	public int getElder() {
		return elder;
	}

	public Player(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	public Player(int id, String name) {
		this(id,name,18);
	}

	public Player whoIsElder(Player player) {
		if(this.age>player.age)
			elder=this.age;
		else
			elder=player.age;
		return player;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
