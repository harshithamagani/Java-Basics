package com.pets.codingdojo.models;

public class Dog extends Animal implements Pet{

	public Dog(String name, String breed, double weight) {
		super(name, breed, weight);
	}

	@Override
	public String showAffection() {
		double weigth = super.getWeight();
		if(weigth < 30) {
			return "Hop into your lap!";
		}
		else {
			return "Curl up next to you";
		}
	}

}
