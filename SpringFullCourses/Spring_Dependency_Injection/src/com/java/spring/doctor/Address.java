package com.java.spring.doctor;

public class Address {

	private String city;
	private String pincode;
	private String state;
	private String country;
	
	public Address(String city, String pincode, String state, String country) {
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String toString() {
		return ""+city+" "+pincode+" "+state+" "+country;
	}
}
