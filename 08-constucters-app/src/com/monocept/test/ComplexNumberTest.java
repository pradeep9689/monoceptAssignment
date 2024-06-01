package com.monocept.test;

import com.monocept.model.ComplexNumber;

public class ComplexNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexNumber complex1 = new ComplexNumber(5,4);
		  ComplexNumber complex2 = new ComplexNumber(3,2);
		  ComplexNumber result = add(complex1,complex2);
		  System.out.println("Addition: "+result.getReal()+" + "+result.getImaginary()+"i");
	 }

	 private static  ComplexNumber add( ComplexNumber complex1,  ComplexNumber complex2) {
	  
		 ComplexNumber result = new ComplexNumber();
	  result.setImaginary(complex1.getImaginary()+complex2.getImaginary());
	  result.setReal(complex1.getReal()+complex2.getReal());
	  return result;

	}

}
