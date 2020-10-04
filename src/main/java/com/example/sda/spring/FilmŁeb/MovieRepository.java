package com.example.sda.spring.FilmŁeb;

import java.util.*;


public class MovieRepository {

    private Map<Integer, Movie> movieList = new TreeMap<>();
    private Integer count = 0;

    //C
    public void addNewMovie(Movie movie) throws ConflictException, CreatedException {
        Collection<Movie> entrySet = movieList.values();
        for(Movie entry: entrySet) {
            if(entry.getTitle().equals(movie.getTitle())){
                throw new ConflictException();
            }
        }
        movieList.put(++count,movie);
        throw new CreatedException();
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

    public String getMovie(Integer key) throws NotFoundException {
        Set<Map.Entry<Integer, Movie>> entrySet = movieList.entrySet();
        for(Map.Entry<Integer, Movie> entry: entrySet) {
            if(key.equals(entry.getKey())){
                return entry.getValue().getTitle();
            }
        }
        throw new NotFoundException();
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
