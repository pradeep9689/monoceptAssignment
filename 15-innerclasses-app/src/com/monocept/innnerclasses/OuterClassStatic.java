package com.monocept.innnerclasses;

public class OuterClassStatic {

	  int x = 10;

	  static class InnerClass {
	    int y = 5;
	  }
	

	
	  public static void main(String[] args) {
	    OuterClassStatic.InnerClass myInner = new OuterClassStatic.InnerClass();
	    System.out.println(myInner.y);
	  }
	}
