package com.javacodegeeks.examples.junitmavenexample;

public class Calculator implements ICalculator {

	public int sum(int a, int b) {
		return a + b;	//returns sum of 2 numbers
	}

	public int subtraction(int a, int b) {
		return a - b;	//returns difference of 2 numbers
	}

	
	public int multiplication(int a, int b) {
		return a * b;	//returns product of 2 numbers
	}

	
	public int divison(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Divider can't be zero");
		}

		return a / b;	//returns division of 2 numbers
	}

	
	public boolean equalIntegers(int a, int b) {
		boolean result = false;

		if (a == b) {
			result = true;
		}

		return result;
	}
}
