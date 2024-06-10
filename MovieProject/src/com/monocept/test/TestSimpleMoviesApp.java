package com.monocept.test;

import java.io.IOException;
import java.util.Scanner;

import com.monocept.Exceptions.CapacityFullException;
import com.monocept.Exceptions.NoSuchMovieFoundException;
import com.monocept.model.Movie;
import com.monocept.model.SimpleMoviesApp;

public class TestSimpleMoviesApp {

	public static void main(String[] args) {
		  
		        try {
		            SimpleMoviesApp simplemoviesapp = new SimpleMoviesApp();
		            Scanner scanner = new Scanner(System.in);
		            while (true) {
		                System.out.println("\n1. Display movies");
		                System.out.println("2. Add movie");
		                System.out.println("3. Display a movie");
		                System.out.println("4. Exit");
		                System.out.print("Enter your choice: ");
		                int choice = scanner.nextInt();
		                scanner.nextLine(); 

		                if (choice == 1) {
		                	simplemoviesapp.displayMovies();
		                    continue;
		                }
		                if (choice == 2) {
		                    try {
		                        System.out.print("Enter movie ID: ");
		                        int movieId = scanner.nextInt();
		                        scanner.nextLine(); 
		                        System.out.print("Enter movie name: ");
		                        String name = scanner.nextLine();
		                        System.out.print("Enter movie genre: ");
		                        String genre = scanner.nextLine();
		                        System.out.print("Enter movie year: ");
		                        int year = scanner.nextInt();
		                        scanner.nextLine(); 
		                        Movie movie = new Movie(movieId, name, genre, year);
		                        simplemoviesapp.addMovie(movie);
		                        System.out.println("Movie added successfully.");
		                    } catch (CapacityFullException e) {
		                        System.out.println(e.getMessage());
		                    }
		                    continue;
		                }
		                if (choice == 3) {
		                    try {
		                        System.out.print("Enter movie ID to display: ");
		                        int movieId = scanner.nextInt();
		                        scanner.nextLine(); 
		                        simplemoviesapp.displayMovie(movieId);
		                    } catch (NoSuchMovieFoundException e) {
		                        System.out.println(e.getMessage());
		                    }
		                    continue;
		                }
		                if (choice == 4) {
		                	System.out.println("ThankYou");
		                	scanner.close();
		                	
		                    System.exit(0);
		                    break;
		                }
		                System.out.println("Invalid choice. Please try again.");
		            }
		            scanner.close();
		        } catch (IOException  e) {
		            e.printStackTrace();
		        }
		        catch( ClassNotFoundException e) {
		        	 e.printStackTrace();
		        	
		        }
		    }
		
	}


