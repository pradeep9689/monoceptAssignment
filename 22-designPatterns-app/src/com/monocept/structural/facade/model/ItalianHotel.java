package com.monocept.structural.facade.model;

public class ItalianHotel implements IHotel {
    @Override
    public IMenu getMenu() {
        return new ItalianMenu();
    }
}
