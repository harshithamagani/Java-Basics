package com.pets.codingdojo.models;

public class Animal {
private String name;
private String breed;
private double weight=0.0;

public Animal(String name, String breed , double weight) {
	this.name = name;
	this.breed = breed;
	this.weight = weight;
}
public String getBreed() {
	return breed;
}
public void setBreed(String breed) {
	this.breed = breed;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}

public String dsiplayInfo(){
    return "Name is " + name + ". Breed is " + breed + " and weight is "+weight;
}

}
