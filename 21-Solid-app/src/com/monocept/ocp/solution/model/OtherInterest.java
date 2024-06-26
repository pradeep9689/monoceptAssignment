package com.monocept.ocp.solution.model;

import com.monocept.ocp.solution.interfaces.FestivalInterest;

public class OtherInterest implements FestivalInterest {
    @Override
    public double getInterestRate() {
        return 6.5;
    }
}

