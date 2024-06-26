package com.monocept.test;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Consumer consumer=(arg)-> System.out.println(arg);
consumer.accept(10);
	}

}
