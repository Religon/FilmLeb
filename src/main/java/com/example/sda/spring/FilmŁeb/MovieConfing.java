package com.example.sda.spring.FilmŁeb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MovieConfing {
    @Bean
    public MovieRepository movie(){
        return new MovieRepository();
    }
}
