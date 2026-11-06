package com.gcu.lab45;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public Application() {
		super();
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
	}

}
