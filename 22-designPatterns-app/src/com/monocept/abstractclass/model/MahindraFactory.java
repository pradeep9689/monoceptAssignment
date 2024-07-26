package com.monocept.abstractclass.model;

public class MahindraFactory implements IcarFactory {
  

	@Override
	public Icar makecar() {
		// TODO Auto-generated method stub
		 return new Mahindra();
	}
}