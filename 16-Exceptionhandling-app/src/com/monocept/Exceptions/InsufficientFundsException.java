package com.monocept.Exceptions;

public class InsufficientFundsException extends RuntimeException{
	public String getMessage() {
		return "insufficent fund";
	}

}
