package com.monocept.creation.singlton.model;

public class Login {

	  private static Login login ; // This line creates a new instance of the Login class

	  private Login() {
	    // This constructor is private, so it cannot be called from outside the Login class
	  }

	  public static Login getLogin() {
		  if(login==null)
			  login=new Login();
	    return login;
	  }

	  public String getMessage() {
	    return "Login Successful";
	  }
	}