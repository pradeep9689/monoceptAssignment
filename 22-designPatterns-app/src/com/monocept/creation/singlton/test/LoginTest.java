package com.monocept.creation.singlton.test;

import com.monocept.creation.singlton.model.Login;

public class LoginTest {

	public static void main(String[] args) {

		  Login login1 = Login.getLogin();
		  Login login2 = Login.getLogin();

		  System.out.println(login1.hashCode());
		  System.out.println(login2.hashCode());
		  
		  System.out.println(login2.getMessage());

		 }

		}
