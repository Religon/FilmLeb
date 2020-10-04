package com.example.sda.spring.FilmŁeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;
    private static final String MODEL_HELLO_MESSAGE_ATTRIBUTE_NAME = "helloMsg";

    //POST  {"title": "abra"}
    @PostMapping("/addMovies")
    public void  addMovie(final Model model, @ModelAttribute Movie movie) throws ConflictException, CreatedException {
        movieRepository.addNewMovie(movie);
    }

    //GET

    @GetMapping(path = "/getMovie/{key}", produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE )
    public String getId(@PathVariable("key") Integer key) throws NotFoundException {
        return movieRepository.getMovie(key);
    }

    //GET
    @GetMapping(path = "/getMovies", produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE)
    public List<String> getAll(final Model model) throws NotFoundException {
        if (movieRepository.getAllMovie().isEmpty()){
            throw new NotFoundException();
        }

        model.addAttribute("Lista filmów:", movieRepository.getAllMovie());
        return movieRepository.getAllMovie();
    }

    //PUT {"title": "kadabra"}
    @PutMapping("/updateMovies/{key}")
    public List<String> updateMovie(@PathVariable("key") Integer key, @RequestBody Movie movie) {
        movieRepository.updateMovieList(key, movie);
        return movieRepository.getAllMovie();
    }

    //DELETE
    @DeleteMapping(path = "/deleteMovies/{key}")
    public void delete(@PathVariable("key") Integer key){
        movieRepository.deleteMovie(key);
    }


    //HttpStatus
    @ResponseStatus(value=HttpStatus.CONFLICT)  // 409
    @ExceptionHandler(ConflictException.class)
    public void conflict() { }

    @ResponseStatus(value = HttpStatus.NOT_FOUND) //404
    @ExceptionHandler(NotFoundException.class)
    public void notfound(){ }

    @ResponseStatus(value = HttpStatus.CREATED) //201
    @ExceptionHandler(CreatedException.class)
    public void created(){ }

}
