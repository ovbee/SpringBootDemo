package com.ovbee.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {
	private static final Logger logger = LogManager.getLogger(HelloWorldApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
