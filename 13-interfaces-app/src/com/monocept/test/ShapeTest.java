package com.monocept.test;

import com.monocept.model.Circle;
import com.monocept.model.Rectangle;
import com.monocept.model.Shape;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape circle=new Circle(20);
circle.area();
circle.perimeter();
Shape rectangle=new Rectangle(10,20);
rectangle.area();
rectangle.perimeter();
	}

}
