package com.monocept.test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.monocept.model.MyTask;

public class MyTaskTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScheduledExecutorService scheduleexecutorservice =Executors.newScheduledThreadPool(1);
		MyTask myTask=new MyTask();
		scheduleexecutorservice.schedule(myTask, 5, TimeUnit.SECONDS);
		scheduleexecutorservice.shutdown();

	}

}
