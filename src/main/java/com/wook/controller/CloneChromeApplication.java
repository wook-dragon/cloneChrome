package com.wook.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class CloneChromeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloneChromeApplication.class, args);
	}

}
