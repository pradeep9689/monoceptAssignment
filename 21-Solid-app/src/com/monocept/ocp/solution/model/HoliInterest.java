package com.monocept.ocp.solution.model;

import com.monocept.ocp.solution.interfaces.FestivalInterest;

public class HoliInterest implements FestivalInterest {
    @Override
    public double getInterestRate() {
        return 7.5;
    }
}

