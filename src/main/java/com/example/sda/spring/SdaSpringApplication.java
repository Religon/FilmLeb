package com.example.sda.spring;

import com.example.sda.spring.FilmŁeb.Movie;
import com.example.sda.spring.FilmŁeb.MovieConfing;
import com.example.sda.spring.FilmŁeb.MovieRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class SdaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdaSpringApplication.class, args);
		ApplicationContext ctx =
				new AnnotationConfigApplicationContext(MovieConfing.class);
	}

}
