package com.monocept.creation.singlton.model;

public class DatabaseManger {
	 private static DatabaseManger dbObject;

	   private DatabaseManger() {      
	   }

	   public static DatabaseManger getInstance() {

	      
	      if(dbObject == null) {
	         dbObject = new DatabaseManger();
	      }

	       return dbObject;
	   }

	   public void getConnection() {
	       System.out.println("You are now connected to the database.");
	   }
	}


