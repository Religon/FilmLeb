package com.example.sda.spring.FilmŁeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @PostMapping("/movies")
    public Movie addMovie(@RequestBody Movie movie){
        movieRepository.addNewMovie(movie);
        return movie;
    }

    @GetMapping(path = "/movies", produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE )
    public String getId(@RequestBody Integer key){
        return movieRepository.getMovie(key);
    }

    @GetMapping(path = "/movies", produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE)
    public List<String> getAll(){
        return movieRepository.getAllMovie();
    }

    @PostMapping("/movies")
    public void updateMovie(@RequestBody Integer key, @RequestBody Movie movie){
        movieRepository.updateMovieList(key, movie);
        getAll();
    }


    @GetMapping(path = "/movies")
    public void delete(@RequestBody Integer key){
        movieRepository.deleteMovie(key);
    }
}
