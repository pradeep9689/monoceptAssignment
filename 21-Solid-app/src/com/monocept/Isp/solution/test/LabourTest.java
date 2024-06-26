package com.monocept.Isp.solution.test;

import com.monocept.Isp.solution.interfaces.ILunchInterval;
import com.monocept.Isp.solution.interfaces.IWorkable;
import com.monocept.Isp.solution.model.Labour;
import com.monocept.Isp.solution.model.Robot;

public class LabourTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 IWorkable labour = new Labour();
		 labour.startWork();
		 labour.stopWork();
		 ILunchInterval lunch=new Labour();
		 lunch.eat();
		 lunch.rest();
		 IWorkable robot = new Robot();
	        robot.startWork();
	        robot.stopWork();
		 

	}

}
