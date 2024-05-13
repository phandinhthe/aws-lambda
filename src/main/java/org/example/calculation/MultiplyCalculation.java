package org.example.calculation;

public class MultiplyCalculation implements Calculation {
	@Override
	public Number calculate(int firstNum, int secondNum) {
		return firstNum * secondNum;
	}
}
