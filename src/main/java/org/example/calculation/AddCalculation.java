package org.example.calculation;

public class AddCalculation implements Calculation {

	@Override
	public Number calculate(int firstNum, int secondNum) {
		return (Integer.sum(firstNum, secondNum));
	}
}
