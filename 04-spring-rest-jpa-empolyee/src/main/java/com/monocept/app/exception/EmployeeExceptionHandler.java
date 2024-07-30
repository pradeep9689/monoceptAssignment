package com.monocept.app.exception;

import java.time.LocalDateTime;
import java.util.HashMap;

import org.hibernate.mapping.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class EmployeeExceptionHandler {
	  @ExceptionHandler
	    public ResponseEntity<EmployeeErrorResponse> handleException(EmployeeNotFoundException e) {
	        EmployeeErrorResponse error = new EmployeeErrorResponse();
	        error.setStatus(HttpStatus.NOT_FOUND.value());
	        error.setMessage(e.getMessage());
	        error.setTimestamp(LocalDateTime.now());

	        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	    }

	    @ExceptionHandler
	    public ResponseEntity<EmployeeErrorResponse> handleException(Exception e) {
	        EmployeeErrorResponse error = new EmployeeErrorResponse();
	        error.setStatus(HttpStatus.NOT_FOUND.value());
	        error.setMessage(e.getMessage());
	        error.setTimestamp(LocalDateTime.now());

	        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	    }

	    @ExceptionHandler(MethodArgumentNotValidException.class)
	    public ResponseEntity<?> handleValidationException(MethodArgumentNotValidException ex) {
	    	HashMap<String, String> errors = new HashMap<>();
	        ex.getBindingResult().getFieldErrors()
	                .forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));
	        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
	    }
	}