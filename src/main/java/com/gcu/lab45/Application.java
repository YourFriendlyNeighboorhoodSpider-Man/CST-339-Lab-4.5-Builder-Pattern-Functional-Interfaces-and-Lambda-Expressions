package com.gcu.lab45;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
	}
}
