package com.monocept.model;

public class MyTask implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("my task strated");
		
		System.out.println("My task end..");
		
	}

}
