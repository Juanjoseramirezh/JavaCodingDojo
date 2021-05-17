package com.codingdojo.calculadoraparte1;

public class CalculatorTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal1 = new Calculator();
		
		cal1.setOperandOne(10.5);
		cal1.setOperandTwo(5.2);
		cal1.setOperation("+");
		
		cal1.performOperation();
		
		System.out.println("This is the result: " + cal1.getResult());
	}
}
