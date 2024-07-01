package com.monocept.decorater.model;

public abstract class CarServiceDecorator implements ICarService {
    private ICarService carObj;

    public CarServiceDecorator(ICarService carObj) {
        this.carObj = carObj;
    }

    @Override
    public double getCost() {
        return carObj.getCost();
    }
}