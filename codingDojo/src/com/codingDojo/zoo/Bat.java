package com.codingDojo.zoo;

public class Bat extends Mammal{
	Bat(){
		super.setEnergyLevel(300);
	}
	public void fly(){
		int totalEnergy = super.getEnergyLevel();
		System.out.println("Testing"+totalEnergy);
		super.setEnergyLevel(totalEnergy-50);
	}
	
	public void eatHumans() {
		int totalEnergy = super.getEnergyLevel();
		System.out.println("Testing"+totalEnergy);
		super.setEnergyLevel(totalEnergy+25);
	}
	
	public void attackTown() {
		int totalEnergy = super.getEnergyLevel();
		System.out.println("Testing"+totalEnergy);
		super.setEnergyLevel(totalEnergy-100);
	}
}
