package com.monocept.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InsurancePolicy {
	  private int policyNumber;
	    private String policyHolderName;
	    private double policyAmount;
	    private Date policyCreationDate;
	    
	    
	    public InsurancePolicy(int policyNumber, String policyHolderName, double policyAmount, String policyCreationDate) throws ParseException {
	        this.policyNumber = policyNumber;
	        this.policyHolderName = policyHolderName;
	        this.policyAmount = policyAmount;
	        this.policyCreationDate = new SimpleDateFormat("yyyy-MM-dd").parse(policyCreationDate);
	    }
	    
	    
	    public int getPolicyNumber() {
	        return policyNumber;
	    }

	    public void setPolicyNumber(int policyNumber) {
	        this.policyNumber = policyNumber;
	    }

	    public String getPolicyHolderName() {
	        return policyHolderName;
	    }

	    public void setPolicyHolderName(String policyHolderName) {
	        this.policyHolderName = policyHolderName;
	    }

	    public double getPolicyAmount() {
	        return policyAmount;
	    }

	    public void setPolicyAmount(double policyAmount) {
	        this.policyAmount = policyAmount;
	    }

	    public Date getPolicyCreationDate() {
	        return policyCreationDate;
	    }

	    public void setPolicyCreationDate(String policyCreationDate) throws ParseException {
	        this.policyCreationDate = new SimpleDateFormat("yyyy-MM-dd").parse(policyCreationDate);
	    }
	    
	    @Override
	    public String toString() {
	        return "Policy Number: " + policyNumber + ", Policy Holder Name: " + policyHolderName + 
	               ", Policy Amount: " + policyAmount + ", Policy Creation Date: " + new SimpleDateFormat("yyyy-MM-dd").format(policyCreationDate);
	    }
	}