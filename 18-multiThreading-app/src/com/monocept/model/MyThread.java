package com.monocept.model;

public class MyThread extends Thread{
	private String Name;

	public MyThread(String name) {
		super(name);
		Name = name;
		start();
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
			try {
				Thread.sleep(900);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
