package com.gcu.lab45;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

@SpringBootApplication
public class Application {
	public Application() {
		super();
	}

	public static void execute(NumberOperation operation, int a, int b) {
			int result = operation.apply(a, b);
			System.out.println("Result: " + result);
		}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		ReportOptions report1 = new ReportOptionsBuilder()
				.setTitle("Annual Report")
				.setPageSize(50)
				.setIncludeDetails(true)
				.build();

		ReportOptions report2 = new ReportOptionsBuilder()
				.setTitle("Summary Report")
				.build(); // Uses default page size and includeDetails

		ReportOptions report3 = new ReportOptionsBuilder()
				.setTitle("Detailed Report")
				.setIncludeDetails(true)
				.build(); // Uses default page size

		System.out.println(report1);
		System.out.println(report2);
		System.out.println(report3);

		// Using DoubleOperation
		NumberOperation doubleOp = new DoubleOperation();
		execute(doubleOp, 10, 5); //Output: Result: 30 (10*2 + 5*2)

		// Using TripleOperation
		NumberOperation tripleOp = new TripleOperation();
		execute(tripleOp, 5, 10); //Output: Result: 45 (5*3 + 10*3)

		//Branch 3: Implementing anonymous class for NumberOperation
		execute(new NumberOperation() {
			@Override
			public int apply(int a, int b) {
				return a * 4 + b * 4; // Quadruple operation
			}
		}, 2, 3); //Output: Result: 20 (2*4 + 3*4)

		//Branch 4: Implementing lambda expression for NumberOperation
		execute((a, b) -> a * 5 + b * 5, 1, 2);
		execute((a, b) -> a * 6 + b * 6, 3, 4);

		//Block Lambda (multi-statement)
		execute((a, b) -> {
			int sum = a + b;
			int product = a * b;
			return sum + product; // Returns sum of a and b plus their product
		}, 2, 3); //Output: Result: 11 (2+3 + 2*3)

		Predicate<String> isEmpty = str -> str.isEmpty();
		System.out.println(isEmpty.test("")); //Output: true
		System.out.println(isEmpty.test("Java")); //Output: false

		Function<String, Integer> stringLength = str -> str.length();
		System.out.println(stringLength.apply("Java")); //Output: 4

		Consumer<String> display = str -> System.out.println(str);
		display.accept("Java"); //Output: Java

		Supplier<String> message = () -> "Hello, World!";
		System.out.println(message.get()); //Output: Hello, World!


	}
}