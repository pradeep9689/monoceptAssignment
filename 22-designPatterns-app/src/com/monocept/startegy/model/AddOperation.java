package com.monocept.startegy.model;

public class AddOperation implements IOperation {
    @Override
    public int doOperation(int a, int b) {
        return a + b;
    }

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return"addtion of A and B";
	}
}