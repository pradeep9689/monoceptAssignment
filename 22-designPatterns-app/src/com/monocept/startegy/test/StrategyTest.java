package com.monocept.startegy.test;

import com.monocept.startegy.model.AddOperation;
import com.monocept.startegy.model.MultiplyOperation;
import com.monocept.startegy.model.OperationStrategy;

public class StrategyTest {

	public static void main(String[] args) {
		OperationStrategy op = new OperationStrategy(new AddOperation());
		System.out.println(op.getDescription());
		System.out.println(op.doOperation(20, 20));

		System.out.println("--------------------------------------");

		op.setOperation(new MultiplyOperation());
		System.out.println(op.getDescription());
		System.out.println(op.doOperation(20, 20));
	}
}