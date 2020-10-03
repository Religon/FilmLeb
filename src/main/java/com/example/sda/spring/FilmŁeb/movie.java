package com.example.sda.spring.FilmŁeb;

import java.beans.ConstructorProperties;

public class Movie {
    private String title;

    @ConstructorProperties({"title"})
    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Movie: " + title;
    }
}
