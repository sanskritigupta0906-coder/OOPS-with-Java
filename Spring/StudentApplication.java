
package com.kiet.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(StudentApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("KIET Student Management System Started");
		logger.info("Loading Student Data...");
		logger.info("Student Management REST API is Ready");
	}
}
