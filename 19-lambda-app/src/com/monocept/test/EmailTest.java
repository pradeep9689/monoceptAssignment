package com.monocept.test;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class EmailTest {

	public static void main(String[] args) {
	    String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
	    Pattern pattern = Pattern.compile(emailRegex);
		// TODO Auto-generated method stub
	    Predicate<String> emailValidator = email -> pattern.matcher(email).matches();{


       
};
if (emailValidator.test("pradeep@gmail.com")) {
    System.out.println(  " is a valid email.");
} else {
    System.out.println(" is an invalid email.");
}

	}

}
