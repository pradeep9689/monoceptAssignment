package com.monocept.model;

public class Consumer1 implements Runnable {
	 Q1 q;
	public Consumer1(Q1 q2) {
	 this.q = q2;
	 new Thread(this, "Consumer").start();
	 }
	 public void run() {
	 while(true) {
	 q.get();
	 }
	 }
	}
