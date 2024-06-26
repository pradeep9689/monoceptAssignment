package com.monocept.Isp.violation.model;

import com.monocept.Isp.violation.interfaces.IWorker;

public class Labour implements IWorker{
	  @Override
	  public void startWork() {
	    System.out.println("Work is started");
	  }
	  
	  @Override
	  public void stopWork() {
	    System.out.println("Work is stopped");
	  }
	  
	  @Override
	  public void eat() {
	    System.out.println("Labour is eating");
	  }
	  
	  @Override
	  public void drink() {
	    System.out.println("Labour is drinking");
	  }
	}
