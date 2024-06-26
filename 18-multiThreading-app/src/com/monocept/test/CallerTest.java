package com.monocept.test;

import com.monocept.model.CallMe;
import com.monocept.model.Caller;

public class CallerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallMe target=new CallMe();
				Caller caller1=new Caller("hi",target);
		Caller caller2=new Caller("Swabhav",target);
		Caller caller3=new Caller("TechLabs",target);
		try {
			caller1.thread.join();
			caller2.thread.join();
			caller3.thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Thread interrupted");
		}
		

	}

}
