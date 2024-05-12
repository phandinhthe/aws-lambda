package org.example.calculation;

public class CalculationFactory {

	private CalculationFactory() {
	}

	public static Calculation calculation(String operation) {
		return switch (operation) {
			case "ADD" -> new AddCalculation();
			case "SUBTRACTION" -> new SubtractionCalculation();
			case "MULTIPLY" -> new MultiplyCalculation();
			default -> new DivideCalculation();
		};
	}
}
