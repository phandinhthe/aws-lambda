package org.example;

import org.example.calculation.CalculationFactory;
import org.example.calculation.CalculationInput;
import org.example.calculation.CalculationOutput;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

/**
 * Hello world!
 */
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}


	@Bean
	Function<CalculationInput, CalculationOutput> handleRequest() {
		System.out.println("testing calculation....");
		return input -> {
			System.out.println("start testing calculation....");
			Number result = CalculationFactory
					.calculation(input.operation()).calculate(input.number1(), input.number2());

			System.out.println("having output already....");
			System.out.println(result);
			return new CalculationOutput(result, "Successfully calculated!", "200-OK");

		};
	}
}
