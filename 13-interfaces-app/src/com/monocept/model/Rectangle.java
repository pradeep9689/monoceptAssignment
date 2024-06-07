package com.monocept.model;

public class Rectangle implements Shape{
private int height;
private int width;
	public Rectangle(int height, int width) {
	
	this.height = height;
	this.width = width;
}

	@Override
	public void area() {
		System.out.println("Area of Rectangle "+(height*width));
		
	}

	@Override
	public void perimeter() {
		System.out.println("perimeter "+(2*(height+width)));
		
	}

}
