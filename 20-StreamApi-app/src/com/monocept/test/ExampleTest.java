package com.monocept.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> names = Arrays.asList("Jayesh", "Nimesh", "Mark", "Mahesh", "Ramesh");

	     
	   List<String> firstThreeSorted = names.stream()
	       .limit(3)
	        .sorted()
	          .collect(Collectors.toList());
	             System.out.println("First 3 students sorted in ascending order: ");
	             firstThreeSorted.stream().forEach(x->System.out.println(x));

	       
	     List<String> firstThreeSortedWithA = names.stream()
	     .limit(3)
	     .filter(name -> name.toLowerCase().contains("a"))
	     .sorted()
	        .collect(Collectors.toList());
	        System.out.println("First 3 students sorted in ascending order if it contains 'a': ");
	        firstThreeSortedWithA.stream().forEach(x->System.out.println(x));
	        
	        List<String> studentsDescending = names.stream()
	          .sorted(Comparator.reverseOrder())
	             .collect(Collectors.toList());
	        System.out.println("Students in descending order: " );
	        studentsDescending.stream().forEach(x->System.out.println(x));
	      
	    }

}
