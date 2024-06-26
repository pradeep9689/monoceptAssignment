package com.monocept.test;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Function<String,Integer> function=e->e.length();
int res=function.apply("TechLab");


System.out.println(res);
}

}
