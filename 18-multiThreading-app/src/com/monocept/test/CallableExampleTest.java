package com.monocept.test;

import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.monocept.model.NewTask;

public class CallableExampleTest {

	public static void main(String[] args) {
		 ExecutorService service = Executors.newFixedThreadPool(5);

	       // Future<Integer> future = service.submit(new NewTask());

	        List<NewTask> tasks = new ArrayList<NewTask>();
	        tasks.add(new NewTask());
	        tasks.add(new NewTask());
	        tasks.add(new NewTask());
	        tasks.add(new NewTask());
	        tasks.add(new NewTask());

	        try {
	            List<Future<Integer>> futures = service.invokeAll(tasks);

	            System.out.println(service.invokeAny(tasks));

	            for (Future<Integer> futureResult : futures) {
	                System.out.println(futureResult.get());
	            }
	        } catch (InterruptedException | ExecutionException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } finally {
	            service.shutdown();
	        }
	    }
	}
