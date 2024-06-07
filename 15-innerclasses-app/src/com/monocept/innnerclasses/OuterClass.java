package com.monocept.innnerclasses;

public class OuterClass {

	 int x = 10;
	public void display() {
		 System.out.println("outer class");
	 }

	  class InnerClass {
	    int y = 5;
	    
	    public void show() {
	    	System.out.println("inner class");
	    }
	  }
	

	
	  public static void main(String[] args) {
	    OuterClass myOuter = new OuterClass();
	   myOuter.display();
	   OuterClass.InnerClass innerClass=myOuter.new InnerClass();
	   innerClass.show();
	  }
	}