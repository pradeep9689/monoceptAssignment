package com.monocept.structural.adapter.test;

import com.monocept.structural.adapter.model.Biscuit;
import com.monocept.structural.adapter.model.Chocolate;
import com.monocept.structural.adapter.model.Hat;
import com.monocept.structural.adapter.model.HatAdapter;
import com.monocept.structural.adapter.model.IItems;
import com.monocept.structural.adapter.model.ShoppingCart;

public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

        Biscuit biscuit = new Biscuit("Oreo", 5);
        cart.addItemToCart(biscuit);
        Chocolate chocolate = new Chocolate("DiryMilk", 10);
        cart.addItemToCart(chocolate);

        Hat hat = new Hat("Cap", "Baseball Cap", 10, 20);
        HatAdapter hatAdapter = new HatAdapter(hat);
        cart.addItemToCart(hatAdapter);
        System.out.println("Item Name\t\tPrice");

       
        for (IItems item : cart.getCartItems()) {
        	 System.out.printf("%-20s %.2f%n", item.getItemName(), item.getItemPrice());           
            
        }
        System.out.printf("%-20s %.2f%n", "Total Cart Price:", cart.getCartPrice());
    }
}