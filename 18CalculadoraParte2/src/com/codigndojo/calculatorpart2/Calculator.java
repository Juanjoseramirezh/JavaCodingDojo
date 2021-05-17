package com.codigndojo.calculatorpart2;

import java.util.ArrayList;

public class Calculator {

	// MEMBER VARIABLE
	private ArrayList<String> operators = new ArrayList<String>();
	private ArrayList<Double> number = new ArrayList<Double>();
	private Double result;

	// CONSTRUCTOR

	public Calculator() {

	}

	// OTHER METHODS

	public void performOperation(Double dub) {
		number.add(dub);
	}

	public void performOperation(int dub) {
		number.add((double) dub);
	}

	public void performOperation(String str) {
		if (str != "=") {
			operators.add(str);
		} else {
			// PRIMERA POSICION
			Double calculo = number.get(number.size() - 1);

			for (int i = operators.size() - 1; i >= 0; i--) {
				switch (operators.get(i)) {
				case "+":
					calculo = calculo + number.get(i);
					break;
				case "-":
					calculo = calculo - number.get(i);
					break;
				case "/":
					calculo = calculo / number.get(i);
					break;
				case "*":
					calculo = calculo * number.get(i);
					break;
				default:
					System.out.println("Operador invalido");
					break;
				}
			}
			this.result = calculo;
		}
	}

	// GETTER AND SETTER
	public ArrayList<String> getOperator() {
		return operators;
	}

	public void setOperator(ArrayList<String> operator) {
		this.operators = operator;
	}

	public ArrayList<Double> getNumber() {
		return number;
	}

	public void setNumber(ArrayList<Double> number) {
		this.number = number;
	}

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

}
