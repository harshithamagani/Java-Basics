package com.coding.dojo.phone;

public class TestPhoneClass {
	public static void main(String[] args) {
		Galaxy g1 = new Galaxy("fjhfek",90,"AT&T","classic");
		IPhone i1 = new IPhone("dshsj",100,"AT&T","iphone");
		System.out.println(g1.ring());
		System.out.println(g1.unlock());
		i1.displayInfo();
	}
}
