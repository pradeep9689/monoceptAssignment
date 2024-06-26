package com.monocept.test;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
	BiPredicate<Integer,Integer> predicate=(number1,number2)->{
		if(number1>number2) 
			return true;
		return false;
			
		
	};
	if(predicate.test(10,2)) {
		System.out.println("number1 is greater");
		System.exit(0);
	}
	System.out.println("number2 is greater");
		

	}

}
