package com.java.spring.company;

public class Company {

	private  final String compName = "Microsoft";
	private double salary;
	private String role;
	
	public String getCompName() {
		return compName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public String toString() {
		
		return "+compName+"+salary+"+role+";
	}
}
