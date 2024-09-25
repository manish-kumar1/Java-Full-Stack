package com.constructor.injection.person;

public class Address {

	String city;
	String state;
	
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	public String toString() {
		
		return city+" "+state+"";
	}
}
