package com.monocept.model;

import java.io.Serializable;

public class Vehicle implements Serializable {
  private  String companyName;

  public  Vehicle(String companyName) {
        this.companyName = companyName;
    }

    void display() {
        System.out.println("Company Name: " + companyName);
    }
}