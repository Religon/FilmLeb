package com.example.sda.spring.FilmŁeb;

import java.util.*;


public class MovieRepository {

    private Map<Integer, Movie> movieList = new TreeMap<>();

    //C
    public void addNewMovie(Movie movie){
        Random generator = new Random();
        movieList.put(generator.nextInt(100),movie);
    }

    //R
    public List<String> getAllMovie() {
        Set<Map.Entry<Integer, Movie>> entrySet = movieList.entrySet();
        List<String> list = new ArrayList<>();
        for(Map.Entry<Integer, Movie> entry: entrySet) {
            list.add(entry.getKey() + " : " + entry.getValue());
        }
        return list;
    }

    public String getMovie(Integer key){
        Set<Map.Entry<Integer, Movie>> entrySet = movieList.entrySet();
        for(Map.Entry<Integer, Movie> entry: entrySet) {
            if(key == entry.getKey()){
                return entry.getValue().getTitle();
            }
        }
       return null;
    }

    //U
    public void updateMovieList(Integer key, Movie movie){
        movieList.put(key, movie);
    }

    //D
    public void deleteMovie(Integer key){
        movieList.remove(key);
    }
}
