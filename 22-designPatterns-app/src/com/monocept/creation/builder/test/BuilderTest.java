package com.monocept.creation.builder.test;

import com.monocept.creation.builder.model.User;
import com.monocept.creation.builder.model.User.UserBuilder;

public class BuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=User.UserBuilder.getInsatnce()
	   .setUserId("101")
	   .setUserName("Pradeep")
	   .setEmail("pradeep@gmail.com")
	   .build();
		System.out.println(user);	}

}
