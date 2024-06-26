package com.monocept.test;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		Supplier supplier=()->{
			Random rand=new Random();
			return rand.nextInt();
		};
System.out.println(supplier.get());
	}

}
