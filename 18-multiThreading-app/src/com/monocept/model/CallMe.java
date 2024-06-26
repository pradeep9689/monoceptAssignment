package com.monocept.model;

public class CallMe {
	void call(String message) {
		System.out.print("["+message);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("]");
	}

}
