package com.example.sda.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class SdaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdaSpringApplication.class, args);
	}
}
