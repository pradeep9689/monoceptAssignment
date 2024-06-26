package com.monocept.ocp.solution.model;

import com.monocept.ocp.solution.interfaces.FestivalInterest;

public class NewYearInterest implements FestivalInterest {
    @Override
    public double getInterestRate() {
        return 8.0;
    }
}

