package com.monocept.Exceptions;

public class CapacityFullException extends RuntimeException {
	public String getMessage() {
		return "Capacity Full";
	}

}
