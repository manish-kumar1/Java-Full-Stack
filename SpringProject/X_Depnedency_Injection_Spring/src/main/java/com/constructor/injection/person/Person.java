package com.constructor.injection.person;

public class Person {

	private String name;
	private int age;
	private Address address;
	
	public Person(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void display() {
		
		System.out.println("Name:  "+name);
		System.out.println("Age:  "+age);
		System.out.println("Address:  "+address);
	}
}
