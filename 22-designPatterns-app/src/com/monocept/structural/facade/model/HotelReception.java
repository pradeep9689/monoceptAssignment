package com.monocept.structural.facade.model;

public class HotelReception {
	public void getIndianMenu() {
        IndianHotel indianHotel = new IndianHotel();
        IMenu indianMenu = indianHotel.getMenu();
        indianMenu.displayMenu();
    }

    public void getItalianMenu() {
        ItalianHotel italianHotel = new ItalianHotel();
        IMenu italianMenu = italianHotel.getMenu();
        italianMenu.displayMenu();
    }
}
