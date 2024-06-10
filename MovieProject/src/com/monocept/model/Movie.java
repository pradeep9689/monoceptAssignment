package com.monocept.model;

import java.io.Serializable;

public class Movie implements Serializable {
    private int movieId;
    private String name;
    private String genre;
    private int year;

    public Movie(int movieId, String name, String genre, int year) {
        this.movieId = movieId;
        this.name = name;
        this.genre = genre;
        this.year = year;
    }

    public int getMovieId() {
        return movieId;
    }

    @Override
    public String toString() {
        return "Movie(ID: " + movieId + ", Name: " + name + ", Genre: " + genre + ", Year: " + year + ")";
    }
}
