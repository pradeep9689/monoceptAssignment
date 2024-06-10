package com.monocept.Exceptions;

public class NegativeAmountException extends RuntimeException{
	public String getMessage() {
		return "amount should not be negative";
	}

}
