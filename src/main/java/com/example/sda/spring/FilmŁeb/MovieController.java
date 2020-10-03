package com.example.sda.spring.FilmŁeb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Scanner;

@RestController
public class MovieController {

    @PostMapping("/addMovie")
    public Movie addMovie(@RequestBody Movie movie){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MovieRepository.class);
        movie = ctx.getBean(Movie.class);
        return movie;
    }

    @GetMapping(path = "/getId", produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE )
    public String getId(){
      return null;
    }

    @GetMapping(path = "/getAll", produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE)
    public String getAll(){
        return null;
    }

    @GetMapping(path = "/deleteMovie")
    public void delete(){
    }
}
