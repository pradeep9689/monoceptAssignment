package com.monocept.decorater.model;

public class StandardHat implements IHat {
    @Override
    public String getName() {
        return "Standard Hat";
    }

    @Override
    public String getPrice() {
        return "100";
    }

    @Override
    public String getDescription() {
        return "A standard hat";
    }
}