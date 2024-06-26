package com.monocept.Dip.solution.test;

import com.monocept.Dip.solution.model.DBLogger;
import com.monocept.Dip.solution.model.FileLogger;
import com.monocept.Dip.solution.model.ILogger;
import com.monocept.Dip.solution.model.TaxCalculator;

public class TaxCalculatorTest {

	public static void main(String[] args) {

        
        TaxCalculator t1 = new TaxCalculator(new DBLogger());
        t1.calculateTax(100, 10);
        
        TaxCalculator t2 = new TaxCalculator(new FileLogger());
        t2.calculateTax(2000, 0);
    }
}