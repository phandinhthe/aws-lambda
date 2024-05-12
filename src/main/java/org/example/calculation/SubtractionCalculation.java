package org.example.calculation;

public class SubtractionCalculation implements Calculation {
	@Override
	public Number calculate(int firstNum, int secondNum) {
		return firstNum - secondNum;
	}
}
