package com.monocept.structural.facade.model;

public class ItalianMenu implements IMenu {
    @Override
    public void displayMenu() {
        System.out.println("Displaying Italian menu...");
        System.out.println("item 1...");
        System.out.println("item 2...");
        System.out.println("item 3...");
       
    }
}