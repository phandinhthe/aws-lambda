package org.example;

import org.example.calculation.CalculationInput;
import org.example.calculation.CalculationOutput;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
	@Test
	@DisplayName("Divide when there is no remain in the result, the result should be a double number without precisions")
	public void testDivide_WhenThereIsNoRemain_ThenResultShouldBeDoubleWithoutPrecision() {
		CalculationOutput output = new AwsLambdaRequestHandlerImpl()
				.handleRequest(new CalculationInput(3, 1, "DIVIDE"), null);
		assertEquals(3.0, output.result());
	}

	@Test
	public void testDivide_WhenThereIsRemain_ThenResultShouldBeInteger() {
		CalculationOutput output = new AwsLambdaRequestHandlerImpl()
				.handleRequest(new CalculationInput(1, 3, "DIVIDE"), null);
		assertEquals(0.333, (double) output.result(), 0.001);
	}

	@Test
	public void testMultiply_WhenHappyCase_ThenResultShouldBeInteger() {
		CalculationOutput output = new AwsLambdaRequestHandlerImpl()
				.handleRequest(new CalculationInput(1, 3, "MULTIPLY"), null);
		assertEquals(3, output.result());
	}

	@Test
	public void testAdd_WhenHappyCase_ThenResultShouldBeInteger() {
		CalculationOutput output = new AwsLambdaRequestHandlerImpl()
				.handleRequest(new CalculationInput(0, 3, "ADD"), null);
		assertEquals(3, output.result());
	}

	@Test
	public void testSubtraction_WhenHappyCase_ThenResultShouldBeInteger() {
		CalculationOutput output = new AwsLambdaRequestHandlerImpl()
				.handleRequest(new CalculationInput(0, 3, "SUBTRACTION"), null);
		assertEquals(-3, output.result());
	}
}
