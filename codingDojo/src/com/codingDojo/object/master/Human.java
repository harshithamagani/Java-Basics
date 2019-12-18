package com.codingDojo.object.master;

public class Human {
	private int strength;
	private int health;
	private int intelligence;
	
	Human(){
		strength=3;
		health=3;
		intelligence=3;
	}
	
	Human(int strength,int health,int intelligence){
		this.setStrength(strength);
		this.setHealth(health);
		this.setIntelligence(intelligence);
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	public void attach(Human h) {
		//health = health - h.getStrength();
		h.setHealth(h.getHealth() - strength);
	}
	
	public void displayInfo(){
		System.out.println(this.getClass() +"   Strength : " + strength+" , Health : " + health+" , Intelligence : " + intelligence);
	}
	
	
}
