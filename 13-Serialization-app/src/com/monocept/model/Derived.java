package com.monocept.model;

public class Derived extends Base {
public int x;

public Derived(int x) {
	super(x);
	this.x = x;
}
public void display() {
	x++;
	System.out.println("Derived x= "+x);
	System.out.println("base x= "+super.x);
}

}
