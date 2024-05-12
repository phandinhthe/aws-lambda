package org.example;

import com.amazonaws.services.lambda.runtime.Context;

public class LambdaMethodHandler {
	public String handleRequest(String input, Context context) {
		context.getLogger().log("input:" + input);
		return "hello world -" + input;
	}
}
