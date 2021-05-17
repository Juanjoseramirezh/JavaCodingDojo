package com.codigndojo.calculatorpart2;

public class CalculatorTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal1 = new Calculator();
		
		cal1.performOperation(10.5);
		cal1.performOperation("+");
		cal1.performOperation(5.2);
		cal1.performOperation("*");
		cal1.performOperation(10);
		cal1.performOperation("=");
		System.out.println("Este es el resultado: " + cal1.getResult());
		
	}

}
