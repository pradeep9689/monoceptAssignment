package com.monocept.model;

public class Producer1 implements Runnable {
	 Q q;
	public  Producer1(Q q) {
	 this.q = q;
	 new Thread(this, "Producer").start();
	 }
	 public void run() {
	 int i = 0;
	 while(true) {
	 q.put(i++);
	 }
	 }
	}
