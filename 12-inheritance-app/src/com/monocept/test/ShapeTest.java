package com.monocept.test;

import com.monocept.model.Circle;
import com.monocept.model.Rectangle;

public class ShapeTest {

	public static void main(String[] args) {
		Circle circle=new Circle(30);
		circle.area();
		Rectangle rectangle=new Rectangle(30,40);
		rectangle.area();

	}

}
