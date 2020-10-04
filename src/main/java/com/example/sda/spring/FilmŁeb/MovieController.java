package com.example.sda.spring.FilmŁeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    //POST  {"title": "abra"}
    @PostMapping("/addMovies")
    public String  addMovie(@RequestBody Movie movie){
        return movieRepository.addNewMovie(movie);
    }

    //GET

    @GetMapping(path = "/getMovie/{key}", produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE )
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String getId(@PathVariable("key") Integer key) throws notFoundException {
        if(movieRepository.getMovie(key) == null){
            throw new notFoundException("404 (Not Found)");
        }else {
            return movieRepository.getMovie(key);
        }
    }

    //GET
    @GetMapping(path = "/getMovies", produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public List<String> getAll() throws notFoundException {
            return movieRepository.getAllMovie();
    }

    //PUT {"title": "kadabra"}
    @PutMapping("/updateMovies/{key}")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public List<String> updateMovie(@PathVariable("key") Integer key, @RequestBody Movie movie){
        movieRepository.updateMovieList(key, movie);
        return movieRepository.getAllMovie();
    }

    //DELETE
    @DeleteMapping(path = "/deleteMovies/{key}")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void delete(@PathVariable("key") Integer key){
        movieRepository.deleteMovie(key);
    }

    private class notFoundException extends Throwable {
        public notFoundException(String message) {
        }
    }
}
