package com.monocept.model;

import com.monocept.Exceptions.AgeNotValidException;

public class Voter {
	private int age;
	private String name;
	public Voter(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void vote() {
		if(age<18)
			throw new AgeNotValidException();
		System.out.println(name+ " has a casted vote");
	}
	

}
