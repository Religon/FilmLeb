package com.example.sda.spring.FilmŁeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    //POST  {"title": "abra"}
    @PostMapping("/addMovies")
    public Movie addMovie(@RequestBody Movie movie){
        movieRepository.addNewMovie(movie);
        return movie;
    }

    //GET
    @GetMapping(path = "/getMovie/{key}", produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE )
    public String getId(@PathVariable("key") Integer key){
        return movieRepository.getMovie(key);
    }

    //GET
    @GetMapping(path = "/getMovies", produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE)
    public List<String> getAll(){
        return movieRepository.getAllMovie();
    }

    //PUT
    @PutMapping("/updateMovies/{key}")
    public List<String> updateMovie(@PathVariable("key") Integer key, @RequestBody Movie movie){
        movieRepository.updateMovieList(key, movie);
        return movieRepository.getAllMovie();
    }

    //DELETE
    @DeleteMapping(path = "/deleteMovies/{key}")
    public void delete(@PathVariable("key") Integer key){
        movieRepository.deleteMovie(key);
    }
}
