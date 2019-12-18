package com.codingDojo.object.master;

public class Ninja extends Human {
	
	Ninja(){
		super.setHealth(10);
	}
	
	public void steal(Human otherHuman) {
		int steal_health = this.getHealth();
		otherHuman.setHealth(otherHuman.getHealth() - steal_health);
		this.setHealth(this.getHealth() + steal_health);
	}
	
	public void runAway() {
		this.setHealth(this.getHealth()-10);
	}

}
