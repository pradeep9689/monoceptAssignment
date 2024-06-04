package com.monocept.model;

public class Car extends Fourwheeler {
  private  double price;

    public Car(String companyName, double mileage, double price) {
        super(companyName, mileage);
        this.price = price;
    }

    @Override
 public   void display() {
        super.display();
        System.out.println("Price: " + price);
    }
}


