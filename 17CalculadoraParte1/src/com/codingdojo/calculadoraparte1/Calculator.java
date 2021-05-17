package com.codingdojo.calculadoraparte1;

public class Calculator {
	// MEMBER VARIABLE
	private Double operandOne;
	private Double operandTwo;
	private String operation;
	private Double result;

	public Calculator() {

	}

	// METHODS

	public void performOperation() {
		if (this.operation.equals("+")) {
			this.result = this.operandOne + this.operandTwo;
		} else if (this.operation.equals("-")) {
			this.result = this.operandOne - this.operandTwo;
		} else {
			System.out.println("this operation its nos avaliable");
		}
	}

	// GETTER AND SETTER
	public Double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(Double operandOne) {
		this.operandOne = operandOne;
	}

	public Double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(Double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public Double getResult() {

		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

}
