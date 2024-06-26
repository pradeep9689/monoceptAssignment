package com.monocept.test;

import com.monocept.model.Tester;

public class testerTest {

	public static void main(String[] args) {
		
		 Tester test=new  Tester() {

	@Override
	public void display()  {
		System.out.println("this is inner class");
		
	}
	
};
test.display();
	}

}
