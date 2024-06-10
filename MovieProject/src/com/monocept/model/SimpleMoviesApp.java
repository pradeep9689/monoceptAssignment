package com.monocept.model;

import java.io.IOException;

import com.monocept.Exceptions.CapacityFullException;
import com.monocept.Exceptions.NoSuchMovieFoundException;

public class SimpleMoviesApp {
	 Movie[] movies=new Movie[5];
    private int count;
    private static final String FILENAME = "movies.ser";

    public SimpleMoviesApp() throws IOException, ClassNotFoundException {
        this.movies = MovieSerialization.loadMovies(FILENAME);
        this.count = 0;
        for (int i = 0; i < 5; i++) {
            if (movies[i] != null) {
                this.count++;
            }
        }
    }

    public void displayMovies() {
        for (int i = 0; i < 5; i++) {
            if (movies[i] != null) {
                System.out.println(movies[i]);
            }
        }System.out.println("No moives Added");
    }

    public void addMovie(Movie movie) throws CapacityFullException, IOException {
        if (count >= 5) {
            throw new CapacityFullException();
        }
        for (int i = 0; i < 5; i++) {
            if (movies[i] == null) {
                movies[i] = movie;
                count++;
                MovieSerialization.saveMovies(movies, FILENAME);
                return;
            }
        }
       
        
    }

    public void displayMovie(int movieId) throws NoSuchMovieFoundException {
        for (int i = 0; i < 5; i++) {
            if (movies[i] != null && movies[i].getMovieId() == movieId) {
                System.out.println(movies[i]);
                return;
            }
        }
        throw new NoSuchMovieFoundException();
    }

   
}


     
	        
	       