package com.monocept.test;

import com.monocept.model.MyThread;

public class MyThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread1=new MyThread("Pradeep1");
		MyThread thread2=new MyThread("Pradeep2");
		MyThread thread3=new MyThread("Pradeep3");
		
		
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


