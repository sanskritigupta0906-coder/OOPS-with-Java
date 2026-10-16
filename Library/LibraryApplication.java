package com.kiet.Library;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryApplication {

    private static final Logger logger =
            LoggerFactory.getLogger(LibraryApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            logger.info("Library Book Management System Started");
            logger.info("Loading Book Catalogue...");
            logger.info("Book Management REST API is Ready");
        };
    }
}