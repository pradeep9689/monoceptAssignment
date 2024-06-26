package com.monocept.test;

import java.util.function.BiConsumer;

public class BiconsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BiConsumer<Integer,Integer> biConsumer=(number1,number2)->{
	number1=number1+number2;
	number2=number1-number2;
	number1=number1-number2;
	System.out.println("number1 :"+number1+" : "+"number2 :"+number2);
};
biConsumer.accept(10, 20);
	}

}
