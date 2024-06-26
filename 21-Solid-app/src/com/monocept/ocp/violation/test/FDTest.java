package com.monocept.ocp.violation.test;

import com.monocept.ocp.violation.model.FestivalType;
import com.monocept.ocp.violation.model.FixedDeposit;

public class FDTest {
    public static void main(String[] args) {
        FixedDeposit fd1 = new FixedDeposit(12345, "Pradeep", 10000, 2, FestivalType.NEWYEAR);
     System.out.println("Interest for NEWYEAR: " + fd1.calculateInterest());

      FixedDeposit fd2 = new FixedDeposit(12346, "Rakesh", 20000, 3, FestivalType.DIWALI);
 System.out.println(" Interest for DIWALI: " + fd2.calculateInterest());

     FixedDeposit fd3 = new FixedDeposit(12347, "Ram", 15000, 1, FestivalType.HOLI);
      System.out.println(" Interest for HOLI: " + fd3.calculateInterest());
 FixedDeposit fd4 = new FixedDeposit(12348, "Shayam", 5000, 4, FestivalType.OTHERS);
        System.out.println(" Interest for OTHERS: " + fd4.calculateInterest());
    }
}
