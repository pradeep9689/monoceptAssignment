package com.monocept.structural.adapter.model;

public class Chocolate implements IItems {
    private String name;
    private double price;

    public Chocolate(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getItemName() {
        return name;
    }

    @Override
    public double getItemPrice() {
        return price;
    }
}