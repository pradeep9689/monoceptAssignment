package com.monocept.decorater.model;

public class PremiumHat implements IHat {
    @Override
    public String getName() {
        return "Premium Hat";
    }

    @Override
    public String getPrice() {
        return "300";
    }

    @Override
    public String getDescription() {
        return "A premium hat";
    }
}