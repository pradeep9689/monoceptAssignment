package com.monocept.decorater.model;

public class WheelAlign extends CarServiceDecorator {
    public WheelAlign(ICarService carObj) {
        super(carObj);
    }

    @Override
    public double getCost() {
        return 400 + super.getCost();
    }
}