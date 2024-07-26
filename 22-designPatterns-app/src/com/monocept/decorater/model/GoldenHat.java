package com.monocept.decorater.model;

public class GoldenHat extends HatDecorator {
    public GoldenHat(IHat hat) {
        super(hat);
    }

    @Override
    public String getName() {
        return hat.getName() + ", Golden";
    }

    @Override
    public String getPrice() {
        return 50 +hat.getPrice() ;
    }

    @Override
    public String getDescription() {
        return hat.getDescription() + " with golden decoration";
    }
}
