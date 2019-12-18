package com.coding.dojo.bank;

public class BankAccountTest {
	public static void main(String [] args) {
		BankAccount b1 = new BankAccount(400,500);
		BankAccount b2 = new BankAccount(100,5000);
		
		System.out.println();
		b1.displayAcountInfo();
		b1.depositMoneyCheckingAcc(300);
		b1.displayAcountInfo();
		
		b2.displayAcountInfo();
		b2.withDrawMoneySavingAcc(1000);
		b2.displayAcountInfo();
	}
}
