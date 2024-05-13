package org.example.calculation;

public class DivideCalculation implements Calculation {
	@Override
	public Number calculate(int firstNum, int secondNum) {
		return (double) firstNum / secondNum;
	}
}
