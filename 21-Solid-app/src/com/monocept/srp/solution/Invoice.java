package com.monocept.srp.solution;

public class Invoice {
    private int id;
    private String description;
    private double amount;
    private double tax;
    private double taxRate;

  
    public Invoice(int id, String description, double amount ) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.taxRate =0.10;
        this.tax = 0;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

  
   
}

