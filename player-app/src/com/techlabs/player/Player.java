package com.techlabs.player;

public class Player {
	private int id;
	private String name;
	private int age;

	public Player(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Player(int id, String name) {
		this(id, name, 18);
	}

	public Player whoIsElder(Player player) {
		if (this.age > player.age)
			return this;
		else
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

	@Override
	public String toString() {
		//String parentObject=super.toString();
		return "id: " + id + ", Name: " + name + ", Age: " + age+", parent: "+super.toString();
	}
	
	public boolean equals(Player otherPlayer) {
		if((this.age==otherPlayer.age)&&(this.id==otherPlayer.id)&&(this.name==otherPlayer.name))
			return true;
		return false;
		
	}
	
}
