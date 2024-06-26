package com.monocept.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<Integer> numbers = Arrays.asList(10, 25, 35, 40, 55);

	        
	        System.out.println("All numbers:");
	        numbers.stream()
	       .forEach(x -> System.out.println(x + 5));

	       
	        System.out.println("All Odd numbers:");
	        numbers.stream()
	        .filter(x -> x % 2 != 0)
	        .forEach(x -> System.out.println(x));

	      
	        List<Integer> evenNumbers = numbers.stream()
	         .filter(x -> x % 2 == 0)
	        .collect(Collectors.toList());

	        
	        System.out.println("All Even numbers:");
	        evenNumbers.stream()
	       .forEach(x -> System.out.println(x));
	        
	        int addition = numbers.stream()
	       .reduce(0, (sum, x) -> sum + x);
	        System.out.println("Sum of elements of list: " + addition);

	        System.out.println("After Multiplying with 5:");
	        List<Integer> multiplyers = numbers.stream()
	        .map(x -> x * 5)
	        .collect(Collectors.toList());
	        multiplyers.forEach(x -> System.out.println(x));
	        List<Integer> lastThree =numbers.stream()
                    .skip(Math.max(0, numbers.size() - 3))
                    .collect(Collectors.toList());
	        System.out.println(lastThree);
	        
	    }
	}
