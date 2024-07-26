package com.monocept.state.test;

import com.monocept.state.model.Context;
import com.monocept.state.model.StartState;
import com.monocept.state.model.StopState;

public class StateApplicationTest {

	public static void main(String[] args) {

		Context context = new Context();
		StartState startState = new StartState();
		startState.doAction(context);
		System.out.println(context.getState().toString());

		StopState stopState = new StopState();
		stopState.doAction(context);
		System.out.println(context.getState().toString());

	}

}
