package com.monocept.test;

import com.monocept.model.Point;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point1=new Point();
		System.out.println("Pont1:");
		System.out.println("("+point1.getX()+", "+point1.getY()+")"); 
		point1.setX(10);
		point1.setY(20);
		System.out.println("("+point1.getX()+", "+point1.getY()+")");
		Point point2=new Point(point1);
		point2=point1;
		System.out.println(point1.hashCode());
		System.out.println(point2.hashCode()); 
		System.out.println("Pont2:" );
		System.out.println("("+point2.getX()+", "+point2.getY()+")");
		Point point3=new Point(25,50);
		System.out.println("Pont3:");
		System.out.println("("+point3.getX()+", "+point3.getY()+")");

	}

}
