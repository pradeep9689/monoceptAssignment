package com.monocept.model;

public class Circle implements Shape{
	private int radius;
	
	

	public Circle(int radius) {
	
		this.radius = radius;
	}

	@Override
	public void area() {
		System.out.println("Area of circle "+(3.14*radius*radius));
		
		
	}

	@Override
	public void perimeter() {
		System.out.println("Area perimeter "+(2*3.14*radius));
		
		
	}

}
