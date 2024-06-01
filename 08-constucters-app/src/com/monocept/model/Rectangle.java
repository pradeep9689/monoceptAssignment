package com.monocept.model;

public class Rectangle {
	private double width;
	private double height;
	
	public Rectangle() {
		this(7,7);
		
	}
	public Rectangle(double width,double height) {
		this.width=width;
		this.height=height;
	}
	public Rectangle(double width) {
		this(width,10);
	}
	
	
	public void setWidth(double width) {
		this.width=width;
	}
	public double getWidth() {
		return width;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public double getHeight() {
		return height;
	}
	

}
