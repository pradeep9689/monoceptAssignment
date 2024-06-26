package com.monocept.Dip.solution.model;

public class FileLogger implements ILogger  {
	public void log(String err) {
        System.out.println("Logged to FileLogger: " + err);
    }

}
