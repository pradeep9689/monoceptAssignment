package com.monocept.abstractclass.model;

public class TataFactory implements IcarFactory {
   

	@Override
	public Icar makecar() {
		// TODO Auto-generated method stub
		 return new Tata();
	}
}