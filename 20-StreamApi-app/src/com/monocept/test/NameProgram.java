package com.monocept.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NameProgram {

	public static void main(String[] args) {
		  try {
	            List<String> namesList = readNamesFromFile("D:\\Pradeep\\20-StreamApi-app\\src\\com\\monocept\\test\\names.txt");

	            List<String> filteredNames = namesList.stream()
	                    .filter(name -> name.startsWith("A"))
	                    .collect(Collectors.toList());
	            System.out.println("Filtered Names Starting with A: " );
	            filteredNames.stream()
	 	       .forEach(x -> System.out.println(x));

	           
	            List<String> uppercaseNames = namesList.stream()
	                    .map(String::toUpperCase)
	             .collect(Collectors.toList());
	            System.out.println("Uppercase Names: ");
	            uppercaseNames.stream()
		 	     .forEach(x -> System.out.println(x));

	            List<String> sortedNames = new ArrayList<>(namesList);
	            Collections.sort(sortedNames);
	            System.out.println("Sorted Names: " );
	            sortedNames.stream()
		 	    .forEach(x -> System.out.println(x));

	            List<String> uniqueNames = namesList.stream()
	            .distinct()
	            .collect(Collectors.toList());
	            System.out.println("Unique Names: " );
	             uniqueNames.stream()
		 	     .forEach(x -> System.out.println(x));


	            long countNamesWithoutI = namesList.stream()
	            .filter(name -> !name.contains("I"))
	             .count();
	            System.out.println("Count of Names Without 'I': " +countNamesWithoutI);
	          

	            String concatenatedNames = String.join(", ", namesList);
	            System.out.println("Concatenated Names: " +concatenatedNames);
	           

	            List<String> filteredNamesJ = namesList.stream()
	                    .filter(name -> name.startsWith("J"))
	                    .map(String::toUpperCase)
	                    .sorted()
	                    .collect(Collectors.toList());
	            System.out.println("Filtered, Uppercase, and Sorted Names Starting with J: "  );
	            filteredNamesJ.stream()
		 	       .forEach(x -> System.out.println(x));

 } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    private static List<String> readNamesFromFile(String filename) throws IOException {
	        List<String> namesList = new ArrayList<>();
	        BufferedReader reader = new BufferedReader(new FileReader(filename));
	        String line;
	        
	          while ((line = reader.readLine()) != null) {
	             namesList.add(line);
	        }
	        reader.close();
	        return namesList;
	    }
	}