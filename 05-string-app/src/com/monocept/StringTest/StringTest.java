package com.monocept.StringTest;

public class StringTest {

	public static void main(String[] args) {
		
		  String firstName = new String("swabav");
		  StringBuffer middleName = new StringBuffer("techlabs");
		  
		  StringBuilder lastName = new StringBuilder("munmbi");
		  lastName.append(middleName);

		  concat1(middleName);
		  concat2(lastName);
		  concat3(firstName);

		  System.out.println(middleName);
		  System.out.println(lastName);
		  System.out.println(firstName);
	}
	private static void concat3(String firstName) {
		  firstName = firstName + " Techlabs Mumbai";
		}

		private static void concat2(StringBuilder lastName) {
		  lastName.append(middleName);
		}

		private static void concat1(StringBuffer middleName) {
		  middleName.append(" Swabhav Mumbai");
		}

}
