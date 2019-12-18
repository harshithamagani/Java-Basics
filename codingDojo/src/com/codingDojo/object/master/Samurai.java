package com.codingDojo.object.master;

public class Samurai extends Human {
	private int count = 0;
	
	Samurai(){
		super.setHealth(200);
		count++;
	}
	
	public void deathBlow(Human other) {
		this.setHealth(this.getHealth() - (this.getHealth()/2));
		other.setHealth(0);
	}
	
	public void meditate() {
		this.setHealth(this.getHealth() + (this.getHealth()/2));
	}

	public void howMany() {
		System.out.println("Total number of Samurai created: "+count);
	}
}