package com.monocept.factory.model;

public class Maruti implements Icar{

	@Override
	public void start() {
		System.out.println("Maruti started");
		
	}

	@Override
	public void stop() {
		System.out.println("Maruti stoped");
		
	}

}
