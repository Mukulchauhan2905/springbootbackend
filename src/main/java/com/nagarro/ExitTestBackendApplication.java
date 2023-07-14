package com.nagarro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.nagarro"})
public class ExitTestBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExitTestBackendApplication.class, args);
	}

}
