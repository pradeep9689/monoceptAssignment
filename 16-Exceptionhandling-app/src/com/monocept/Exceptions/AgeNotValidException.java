package com.monocept.Exceptions;

public class AgeNotValidException extends RuntimeException{
public String getMessage() {
	return "Age not Valid";
}
}
