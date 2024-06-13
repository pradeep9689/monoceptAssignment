package com.monocept.test;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());
		Thread thread=Thread.currentThread();
		thread.setName("ThraedMain");
		for(int i=1;i<11;i++){
			System.out.println(thread.getName()+" : "+i);
			try {
				thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
