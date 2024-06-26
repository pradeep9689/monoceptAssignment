package com.monocept.test;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryOperator<Integer> binary=(number1,number2)->number1+number2;
		System.out.println(binary.apply(9, 2));

	}

}
