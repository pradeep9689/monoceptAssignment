package com.monocept.abstractclass.model;

public class MarutiFactory implements IcarFactory {
   

	@Override
	public Icar makecar() {
		// TODO Auto-generated method stub
		 return new Maruti();
	}
}