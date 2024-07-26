package com.monocept.factory.model;

public class CarFactory {
	private static Icar car;
public static Icar getInsatnce(String carName) {
	if(carName=="Maruti")
		car=new Maruti();
	if(carName=="Suzaki")
		car=new Suzaki();
	if(carName=="Mahindra")
		car=new Mahindra();
	return car;
}
}
