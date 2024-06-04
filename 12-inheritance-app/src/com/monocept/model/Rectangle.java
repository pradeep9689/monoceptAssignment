package com.monocept.model;

public class Rectangle extends Shape{
private int hight;
private int width;

	public Rectangle(int hight, int width) {
	
	this.hight = hight;
	this.width = width;
}

	@Override
	public void area() {
		System.out.println("area of Rectangle: "+width*hight);
		
	}

}
