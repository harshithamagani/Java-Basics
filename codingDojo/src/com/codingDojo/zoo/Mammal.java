package com.codingDojo.zoo;

public class Mammal {
	private int energyLevel;
	
	Mammal(){
		energyLevel = 100;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public void displayEnergy() {
		System.out.println("The toal energy felt for the mammal"+energyLevel);
	}
}
