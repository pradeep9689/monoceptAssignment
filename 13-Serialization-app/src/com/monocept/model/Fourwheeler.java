package com.monocept.model;

public class Fourwheeler extends Vehicle {
 private   double mileage;

  public  Fourwheeler(String companyName, double mileage) {
        super(companyName);
        this.mileage = mileage;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Mileage: " + mileage + " km/l");
    }
}