package com.monocept.model;

public class InputValidator {
	
	public boolean validator(String input,int minLength,int maxLength) {
		if(input==null || input==""||input.length()<minLength||input.length()>maxLength)
			return false;
		return true;
	}
	
	
	public  boolean validateUsername(String userName) {
    return validator(userName,3,20);
}

public  boolean validatePassword(String password) {
	 return validator(password,3,20);
}

public  boolean validateEmail(String email) {
    
   if( !validator(email,5,50))
	   return true;
   if(!email.contains("@")||!email.contains("."))
	   return false;
   return true;
    
}
}