package com.monocept.Isp.solution.model;

import com.monocept.Isp.solution.interfaces.ILunchInterval;
import com.monocept.Isp.solution.interfaces.IWorkable;

public class Labour implements IWorkable, ILunchInterval {
    @Override
    public void startWork() {
        System.out.println("Labour starts working");
    }

    @Override
    public void stopWork() {
        System.out.println("Labour stops working");
    }

    @Override
    public void eat() {
        System.out.println("Labour is eating");
    }

    @Override
    public void rest() {
        System.out.println("Labour is drinking");
    }
}
