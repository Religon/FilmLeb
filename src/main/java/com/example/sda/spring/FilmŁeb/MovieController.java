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
    public void   addMovie(@RequestBody Movie movie) throws ConflictException {
            movieRepository.addNewMovie(movie);
    }

    //GET

    @GetMapping(path = "/getMovie/{key}", produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE )
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String getId(@PathVariable("key") Integer key){
        return movieRepository.getMovie(key);
    }

    //GET
    @GetMapping(path = "/getMovies", produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE)
    public List<String> getAll(){
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


    //HttpStatus
    @ResponseStatus(value=HttpStatus.CONFLICT)  // 409
    @ExceptionHandler(ConflictException.class)
    public void conflict() {
    }

}
