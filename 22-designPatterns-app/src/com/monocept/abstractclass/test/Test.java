package com.monocept.abstractclass.test;

import com.monocept.abstractclass.model.Icar;
import com.monocept.abstractclass.model.IcarFactory;
import com.monocept.abstractclass.model.MahindraFactory;
import com.monocept.abstractclass.model.MarutiFactory;
import com.monocept.abstractclass.model.TataFactory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 IcarFactory marutiFactory = new MarutiFactory();
	        Icar maruti = marutiFactory.makecar();
	        maruti.start();
	        maruti.stop();
	        
	        IcarFactory tataFactory = new TataFactory();
	        Icar tata = tataFactory.makecar();
	        tata.start();
	        tata.stop();
	        
	        IcarFactory mahindraFactory = new MahindraFactory();
	        Icar mahindra = mahindraFactory.makecar();
	        mahindra.start();
	        mahindra.stop();
	    }
	}