package com.monocept.Isp.violation.model;

import com.monocept.Isp.violation.interfaces.IWorker;

public class Robot implements IWorker{
	  @Override
	  public void startWork() {
	    System.out.println("Work is started");
	  }
	  
	  @Override
	  public void stopWork() {
	    System.out.println("Work is stopped");
	  }
	  
	  public void eat() {
	    System.out.println("Robot can't eat");
	  }
	  
	  public void drink() {
	    System.out.println("Labour can't drink");
	  }
	}
