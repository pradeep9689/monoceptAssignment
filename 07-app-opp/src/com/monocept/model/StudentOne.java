package com.monocept.model;

public class StudentOne {
	private int rollNumber;
	private String name;
	private int age;
	private String email;
	public StudentOne() {
		super();
	}
	public StudentOne(int rollNumber, String name, int age, String email) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
		this.email = email;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "StudentOne [rollNumber=" + rollNumber + ", name=" + name + ", age=" + age + ", email=" + email + "]";
	}

}
