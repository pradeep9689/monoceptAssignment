package com.monocept.creation.singlton.test;

import com.monocept.creation.singlton.model.DatabaseManger;

public class DBMangerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseManger db1;

	      
	      db1= DatabaseManger.getInstance();
	      
	      db1.getConnection();
	   
	

	}

}
