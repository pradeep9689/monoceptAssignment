package com.monocept.test;

import java.util.function.BiFunction;

public class BiFunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer,Integer,Double> function=(x,y)->(double)(x+y);
		double result=function.apply(10, 20);
		System.out.println(result);

	}

}
