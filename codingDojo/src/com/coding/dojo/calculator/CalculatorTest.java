package com.coding.dojo.calculator;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator= new Calculator("+",2,4);
		calculator.performOperation();
		calculator.displayInfo();
		
		Calculator calculator1= new Calculator("-",2,4);
		calculator1.performOperation();
		calculator1.displayInfo();
	}
}
