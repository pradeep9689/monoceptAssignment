package com.monocept.factory.test;

import com.monocept.factory.model.CarFactory;
import com.monocept.factory.model.Icar;
import com.monocept.factory.model.Mahindra;
import com.monocept.factory.model.Maruti;
import com.monocept.factory.model.Suzaki;

public class IcarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Icar icar;
		icar=CarFactory.getInsatnce("Maruti");
		icar.start();
		icar.stop();
		
		 icar=CarFactory.getInsatnce("Suzaki");
		icar.start();
		icar.stop();
		
		
	 icar=CarFactory.getInsatnce("Mahindra");
		icar.start();
		icar.stop();

	}

}
