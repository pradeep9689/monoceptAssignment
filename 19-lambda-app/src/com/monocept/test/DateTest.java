package com.monocept.test;

import java.time.LocalDate;
import java.util.function.Supplier;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> supplier=()->{
			LocalDate currentDate = LocalDate.now()
;			return currentDate.toString();
		};
		System.out.println(supplier.get());
	}

}
