package com.monocept.model;

public class Box {
	private double width;
	private double height;
	private double dept;
	
	
	public Box() {
		
	}
	public Box(double width, double height, double dept) {
		
		this.width = width;
		this.height = height;
		this.dept = dept;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getDept() {
		return dept;
	}
	public void setDept(double dept) {
		this.dept = dept;
	}

}
