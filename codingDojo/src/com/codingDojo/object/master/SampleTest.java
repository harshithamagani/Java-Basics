package com.codingDojo.object.master;

public class SampleTest {
	public static void main(String [] args) {
		Wizard w1 = new Wizard();
		Wizard w2 = new Wizard();
		Samurai s1 = new Samurai();
		Samurai s2 = new Samurai();
		Ninja n1 = new Ninja();
//		s2.deathBlow(w2);
//		w2.displayInfo();
//		w1.heal(w2);
//		w2.displayInfo();
//		s2.displayInfo();
		s2.meditate();
//		s2.displayInfo();
//		n1.displayInfo();
		n1.steal(s2);
		n1.displayInfo();
		s2.displayInfo();
		
	}
}
