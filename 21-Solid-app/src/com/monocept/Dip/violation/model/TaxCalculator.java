package com.monocept.Dip.violation.model;

public class TaxCalculator {
	 private DBLogger logger;

	    public TaxCalculator() {
	    	super();
	       
	    }

	    public void calculateTax(int amount, int rate) {
	    	 int tax = 0;
	    	    try {
	    	      tax = amount/rate;
	    	      System.out.println(tax);
	    	    }
	    	    catch(Exception e) {
	    	      new DBLogger().log("Divide by zero");
	    	    }
	    	  }
	    	}

