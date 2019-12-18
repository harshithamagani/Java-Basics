package com.codingDojo.object.master;

public class Wizard extends Human{

	Wizard(){
		super.setHealth(50);
		super.setIntelligence(8);
		
	}
	
	public void heal(Human h){
		int gainHealth = this.getIntelligence();
		h.setHealth(h.getHealth()+gainHealth);	
	}
	
	public void fireball(Human otherHuman) {
		otherHuman.setHealth(otherHuman.getHealth() - (this.getIntelligence()*3));
	}
	
	
}
