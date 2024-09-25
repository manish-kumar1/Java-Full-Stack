package com.java.spring.customer;

import java.util.Iterator;
import java.util.Map;

public class Customer {

	private String name;
	private String gender;
	private String mobileNo;

	private Payment payment;
	private Address address;
	private Product product;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public void display() {
		System.out.println();
		System.out.println("Customer:  "+name+"     Gender:  "+gender+"\n");
		System.out.println("Mobile No:  "+mobileNo+"\n");
		System.out.println("City:  "+getAddress().getCity()+"     Pincode:  "+getAddress().getPincode()+"\n");
		System.out.println("Transication Id:  "+getPayment().getTransicationId()+"    Mode:  "+getPayment().getMode()+"    Time:  "+getPayment().getTime()+"\n");
		
		System.out.println("Product Name      "+"     Price");
		int total_price = 0;
		Iterator<Map.Entry<String, Integer>> iterator = product.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, Integer> itr = iterator.next();
			System.out.println(itr.getKey()+"            "+itr.getValue());
			total_price = total_price + itr.getValue();
		}
		System.out.println("Total Price = "+total_price);
	}
	
}
