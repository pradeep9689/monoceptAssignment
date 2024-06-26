package com.monocept.test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.monocept.model.MyTask;

public class MyTask1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScheduledExecutorService scheduleexecutorservice =Executors.newScheduledThreadPool(1);
		MyTask myTask=new MyTask();
		scheduleexecutorservice.scheduleAtFixedRate(myTask, 5, 3, TimeUnit.SECONDS);
		//scheduleexecutorservice.shutdown();

	}

}
