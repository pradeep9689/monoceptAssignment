package com.monocept.decorater.model;

public abstract class HatDecorator implements IHat {
    public IHat hat;

    public HatDecorator(IHat hat) {
        this.hat = hat;
    }

    @Override
    public abstract String getName();

    @Override
    public abstract String getPrice();

    @Override
    public abstract String getDescription();
}
