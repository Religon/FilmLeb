package com.example.sda.spring.FilmŁeb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MovieRepository {

    private List<Movie> movieList = new ArrayList<>();

    //C
    @Bean
    public void addNewMovie(Movie movie){
        movieList.add(movie);
    }

    //R
    @Bean
    public void getAllMovie() {
        System.out.println("Lista filmów: ");
        movieList.forEach(System.out::println);
        System.out.println();
    }

    //D
    @Bean
    public void deleteMovie(String title){
    }

    @Bean
    public List<Movie> getMovieList() {
        return movieList;
    }

    @Bean
    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }
}
