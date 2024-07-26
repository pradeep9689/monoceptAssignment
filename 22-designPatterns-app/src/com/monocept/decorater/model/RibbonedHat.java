package com.monocept.decorater.model;

public class RibbonedHat extends HatDecorator {
    public RibbonedHat(IHat hat) {
        super(hat);
    }

    @Override
    public String getName() {
        return hat.getName() + ", Ribboned";
    }

    @Override
    public String getPrice() {
        return hat.getPrice() + " + 30";
    }

    @Override
    public String getDescription() {
        return hat.getDescription() + " with ribbon decoration";
    }
}