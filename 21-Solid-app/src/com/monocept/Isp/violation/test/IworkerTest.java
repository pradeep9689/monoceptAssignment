package com.monocept.Isp.violation.test;

import com.monocept.Isp.violation.interfaces.IWorker;
import com.monocept.Isp.violation.model.Labour;
import com.monocept.Isp.violation.model.Robot;

public class IworkerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IWorker labour = new Labour();
		  labour.startWork();
		  labour.drink();
		  labour.eat();
		  labour.stopWork();
		  
		  IWorker robot = new Robot();
		  robot.startWork();
		  robot.drink();
		  robot.eat();
		  robot.stopWork();
		  
		 



	}

}
