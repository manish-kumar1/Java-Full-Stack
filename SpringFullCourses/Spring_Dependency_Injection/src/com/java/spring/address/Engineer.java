package com.java.spring.address;

import com.java.spring.doctor.Address;

public class Engineer {

	private String role;
	private String comp;
	private int salary;
	private Address address;
	
	public Engineer(String role, String comp, int salary, Address address) {
		this.role = role;
		this.comp = comp;
		this.salary = salary;
		this.address = address;
	}
	
	public void display() {
		System.out.println("Role:  "+role);
		System.out.println("Company:  "+comp);
		System.out.println("Salary:  "+salary);
		System.out.println("Address:  "+address.toString());
		
		System.out.println("-------------------");
	}
}
