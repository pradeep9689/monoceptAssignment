package com.monocept.model;

import java.util.Random;
import java.util.concurrent.Callable;

public class NewTask implements Callable{

	@Override
	public Integer call() throws Exception {
		Random rand=new Random();
		return rand.nextInt();
	}

}
