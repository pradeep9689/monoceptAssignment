package com.monocept.model;

public class NewThread implements Runnable{
	private Thread thread;
	public NewThread(String name) {
		this.thread=new Thread(this,name);
		thread.start();
		
	}

	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
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
