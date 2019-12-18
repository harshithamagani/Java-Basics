package com.coding.dojo.bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	private static int numOfAccount;
	private static double accBalanceTotalBank;
	
	BankAccount(){
		this.accountNumber=randomString();
		this.checkingBalance = 0.0;
		this.savingsBalance = 0.0;
		accBalanceTotalBank = checkingBalance + savingsBalance;
	}
	
	BankAccount(double checkingBalance, double savingsBalance){
		this.accountNumber=randomString();
		this.checkingBalance = checkingBalance;
		this.savingsBalance =  savingsBalance;
		numOfAccount++;
		accBalanceTotalBank = checkingBalance + savingsBalance;
	}
	
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	String randomString(){
        Random r = new Random();
        Character [] alpha = {'1','2','3','4','5','6','7','8','9','0'};
        ArrayList<Character> listOfChar = new ArrayList<>();
        Collections.addAll(listOfChar,alpha); 
        String randomStr = "";
        for(int i=0;i<10;i++){       
        int num = r.nextInt(9);
        Character randChar = alpha[num];
        randomStr = randomStr.concat(randChar.toString());
        }
        return randomStr; 
    }
	
	public static int getNumOfAccount(){
		return numOfAccount;
	}
	
	public static double getAccBalanceTotalBank(){
		return accBalanceTotalBank;
	}
	
	public void depositMoneyCheckingAcc(double amount) {
		this.checkingBalance = this.checkingBalance + amount;
	}
	
	public void depositMoneySavingAcc(double amount) {
		this.savingsBalance = this.savingsBalance + amount;
	}
	
	public void withDrawMoneySavingAcc(double amount) {
		this.savingsBalance = this.savingsBalance - amount;
	}
	
	public void withDrawMoneyCheckingAcc(double amount) {
		this.savingsBalance = this.savingsBalance - amount;
	}
	
	void displayAcountInfo(){
		System.out.println("Banking Account : " + this.accountNumber + " , Checking Account Balance: "+this.checkingBalance+", Saving Account Balance:"+this.savingsBalance);
	}

}
