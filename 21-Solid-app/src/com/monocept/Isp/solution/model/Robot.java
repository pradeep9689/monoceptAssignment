package com.monocept.Isp.solution.model;

import com.monocept.Isp.solution.interfaces.IWorkable;

public class Robot implements IWorkable {
    @Override
    public void startWork() {
        System.out.println("Robot starts working");
    }

    @Override
    public void stopWork() {
        System.out.println("Robot stops working");
    }
}