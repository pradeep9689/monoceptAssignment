package com.monocept.Dip.solution.model;

public class TaxCalculator {
	private ILogger logger;

    public TaxCalculator(ILogger logger) {
        this.logger = logger;
    }

    public int calculateTax(int amount, int rate) {
        int tax = 0;
        try {
            tax = amount / rate;
            System.out.println(tax);
        } catch (Exception e) {
            logger.log("Divide by zero");
        }
        return tax;
    }

}
