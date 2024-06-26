package com.monocept.test;

import com.monocept.model.Consumer;
import com.monocept.model.Producer;
import com.monocept.model.Q;

public class PcTest {

	public static void main(String[] args) {
		Q q = new Q();
		 new Producer(q);
		 new Consumer(q);
		 System.out.println("Press Control-C to stop.");
		 }
		
	

	}


