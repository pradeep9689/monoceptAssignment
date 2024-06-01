package com.monocept.model;

public class ComplexNumber {
	 private double real;
	    private double imaginary;

	    
	    public ComplexNumber() {
	        this.real = 0.0;
	        this.imaginary = 0.0;
	    }

	   
	    public ComplexNumber(double real, double imaginary) {
	        this.real = real;
	        this.imaginary = imaginary;
	    }
	    public void setReal(double real) {
	        this.real = real;
	    }
	    
	    public double getReal() {
	        return real;
	    }
	    public void setImaginary(double imaginary)
	    {
	        this.imaginary = imaginary;
	    }
	    
	   
	    public double getImaginary() {
	        return imaginary;
	    }
	    public void display() {
	        System.out.println(this.real + " + " + this.imaginary + "i");
	    }
	    public String add(double real,double imaginary) {
	    	this.real+=real;
	    	this.imaginary+=imaginary;
	    	return (this.real+" + "+this.imaginary);
	    }
	  
	   
	

}
