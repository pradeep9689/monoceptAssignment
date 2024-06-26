package com.monocept.test;

import com.monocept.model.Consumer1;
import com.monocept.model.Producer1;
import com.monocept.model.Q1;

public class PC1Test {

	public static void main(String[] args) {
		
		Q1 q = new Q1();
		 new Producer1(q);
		 new Consumer1(q);
		 System.out.println("Press Control-C to stop.");
		 }
		}

	}

}
