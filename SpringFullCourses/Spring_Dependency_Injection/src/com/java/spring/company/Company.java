package com.java.spring.company;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {

	@Value("JKL2024SK")
	private String id;
	private static final String name = "Intuit";
	@Value("12345")
	private int noofEmp;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getNoofEmp() {
		return noofEmp;
	}
	public void setNoofEmp(int noofEmp) {
		this.noofEmp = noofEmp;
	}
	public String getName() {
		return name;
	}
	
	public void display() {
		System.out.println("Id:  "+id);
		System.out.println("Name:  "+name);
		System.out.println("Number of Employee:  "+noofEmp);
	}
}
