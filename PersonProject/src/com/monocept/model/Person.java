package com.monocept.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    String name;
    int age;
    String address;

    
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

   
    public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address;
    }

   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
        	return true;
        if (obj == null || getClass() != obj.getClass())
        	return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name) && address.equals(person.address);
    }
}



