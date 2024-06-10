package com.monocept.Exceptions;

public class NoSuchMovieFoundException extends RuntimeException{
	public String getMessage() {
		return "NoSuch Moive Found";
	}

}
