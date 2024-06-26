package com.monocept.srp.solution;

public class TaxCalculator {
    public void calculateTax(Invoice invoice) 
    {
        double tax = invoice.getAmount() * invoice.getTaxRate();
        invoice.setTax(tax);
    }
}
