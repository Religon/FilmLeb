package com.example.sda.spring.FilmŁeb;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieController {
    @PostMapping("/addMovie")
    @ResponseBody
    public Movie addMovie(@RequestBody Movie movie){
        return movie;
    }

    @GetMapping(path = "/getId", produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE )
    public String getId(){
      return null;
    }

    @GetMapping(path = "/getAll", produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE)
    public String getAll(){
        Movie movie = new Movie("(path = \"/getAll\",MediaType.APPLICATION_PROBLEM_JSON_VALUE)");
        return movie.getTitle();
    }

    @GetMapping(path = "/deleteMovie")
    public void delete(){
    }
}
