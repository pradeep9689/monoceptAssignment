package com.monocept.test;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOperator<String> unary=name->"hello "+name;
		System.out.println(unary.apply("pradeep"));
		
		
		

	}

}
