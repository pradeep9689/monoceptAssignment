package com.monocept.composite.test;

import com.monocept.composite.model.SimpleTask;
import com.monocept.composite.model.Task;
import com.monocept.composite.model.TaskList;

public class TaskManagementApp {

	public static void main(String[] args) {
		  Task simpleTask1 = new SimpleTask("Complete Coding");
	        Task simpleTask2 = new SimpleTask("Write Documentation");
	 
	        TaskList projectTasks = new TaskList("Project Tasks");
	        projectTasks.addTask(simpleTask1);
	        projectTasks.addTask(simpleTask2);
	 
	        TaskList phase1Tasks = new TaskList("Phase 1 Tasks");
	        phase1Tasks.addTask(new SimpleTask("Design"));
	        phase1Tasks.addTask(new SimpleTask("Implementation"));
	 
	        projectTasks.addTask(phase1Tasks);
	 
	        projectTasks.display();
	    }
	}