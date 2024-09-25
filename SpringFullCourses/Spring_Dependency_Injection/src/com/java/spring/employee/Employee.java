package com.java.spring.employee;

public class Employee {

	private String empId;
	private String empName;
	private static String compName = "Microsoft";
	private int salary;
	
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

//	public Employee(int salary) {
//		this.salary = salary;
//	}
//	
//	public Employee(String empId) {
//		this.empId = empId;
//	}
//	
//	
//	public Employee(String empId, String empName, int salary) {
//		super();
//		this.empId = empId;
//		this.empName = empName;
//		this.salary = salary;
//	}
	
	public void display() {
		System.out.println("Employee Id:  "+empId);
		System.out.println("Employee Name:  "+empName);
		System.out.println("Company Name:  "+compName);
		System.out.println("Salary:  "+salary);
		
		System.out.println("----------------------");
	}
}
