package com.pets.codingdojo.models;

public class Cat extends Animal implements Pet {

	public Cat(String name, String breed, double weight) {
		super(name, breed, weight);
	}

	@Override
	public String showAffection() {
		return "Looked at you with some effection. You think!";
	}

}
