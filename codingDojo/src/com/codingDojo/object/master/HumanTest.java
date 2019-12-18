package com.codingDojo.object.master;

public class HumanTest {
	public static void main(String [] args) {
		Human h1 = new Human(100,200,100);
		Human h2 = new Human(10,40,50);
		
		h2.attach(h1);
		
		h1.displayInfo();
		h2.displayInfo();
	}
}
