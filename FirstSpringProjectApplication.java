package com.example.firstSpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringProjectApplication implements CommandLineRunner {
	@Autowired
	HelloWorld hw;

	public static void main(String[] args) {

		SpringApplication.run(FirstSpringProjectApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		hw.display();
	}
}
