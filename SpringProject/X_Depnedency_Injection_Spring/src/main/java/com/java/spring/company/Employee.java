package com.java.spring.company;

import java.util.Iterator;
import java.util.Map;

public class Employee {

	private String empId;
	private String empName;
	private String city;
	private String mobileNo;
	private String gender;
	private int count;
	
	private Company company;
	private WorkDays workdays;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public WorkDays getWorkdays() {
		return workdays;
	}
	public void setWorkdays(WorkDays workdays) {
		this.workdays = workdays;
	}
	
	public void display() {
		System.out.println();
		System.out.println("Employee Id:  "+empId+"      Name:  "+empName+"\n");
		System.out.println("City:  "+city+"      Mobile No:  "+mobileNo+"\n");
		System.out.println("Gender:  "+gender+"\n");
		System.out.println("Company Name:  "+getCompany().getCompName()+"    Salary:  "+getCompany().getSalary()+"\n");
		System.out.println("Role:  "+getCompany().getRole()+"\n");
		
		System.out.println("Days             Status"+"\n");
		int absent = 0;
		Iterator<Map.Entry<String, String>> iterator = workdays.entrySet().iterator();
		while(iterator.hasNext()) {
			
			Map.Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey()+"          "+entry.getValue()+"\n");
			
			if(entry.getValue().equals("Absent")) {
				absent++;
				setCount(absent);
			}
		}
		System.out.println("Absent in one Week:  "+getCount());
	}
}
