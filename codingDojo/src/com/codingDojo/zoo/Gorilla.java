package com.codingDojo.zoo;

public class Gorilla extends Mammal{

	public void throwSomething() {
	 int total_energy = getEnergyLevel();
	 setEnergyLevel(total_energy-5);
	}
	
	public void eatBananas() {
		int total_energy = getEnergyLevel();
		 setEnergyLevel(total_energy+10);
	}
 
	public void climb() {
		int total_energy = getEnergyLevel();
		 setEnergyLevel(total_energy-10);
	}
	
}