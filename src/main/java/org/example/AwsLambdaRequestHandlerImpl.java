package org.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.example.calculation.CalculationInput;
import org.example.calculation.CalculationOutput;
import org.example.calculation.CalculationFactory;
import org.example.calculation.MessageUtils;

public class AwsLambdaRequestHandlerImpl implements RequestHandler<CalculationInput, CalculationOutput> {
	@Override
	public CalculationOutput handleRequest(CalculationInput input, Context context) {
		Number result = CalculationFactory
				.calculation(input.operation()).calculate(input.number1(), input.number2());
		return new CalculationOutput(result, MessageUtils.successfulMessage(input.number1(), input.number2(), result, input.operation())
				, "200-OK");
	}
}
