package org.example.calculation;

public class MessageUtils {

	public static String successfulMessage(int first, int second, Number result, String operation) {
		if (null == operation || operation.trim().isBlank()) {
			throw new RuntimeException("Operation can not be lank");
		}

		operation = operation.toLowerCase();
		if (result instanceof Integer)
			return String.format(
					"Successful %s calculated: first number %d, second number %d, result %d"
					, operation, first, second, result
			);

		return String.format(
				"Successful %s calculated: first number %d, second number %d, result %5f"
				, operation, first, second, result
		);
	}
}