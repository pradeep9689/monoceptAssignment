package com.monocept.model;

public class BoxWeight extends Box {
	private double weight;

	public BoxWeight(double width,double height,double dept,double weight) {
		super(width,height,dept);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
