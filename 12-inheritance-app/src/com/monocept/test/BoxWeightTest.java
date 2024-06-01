package com.monocept.test;

import com.monocept.model.BoxWeight;

public class BoxWeightTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BoxWeight boxweight=new BoxWeight();
boxweight.setHeight(20);
boxweight.setWeight(100);
boxweight.setDept(50);
boxweight.setWidth(100);
System.out.println(boxweight.getHeight());
System.out.println(boxweight.getDept());
System.out.println(boxweight.getWeight());
System.out.println(boxweight.getWidth());

	}

}
