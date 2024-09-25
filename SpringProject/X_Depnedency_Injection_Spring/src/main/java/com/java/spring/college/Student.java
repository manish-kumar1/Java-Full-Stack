package com.java.spring.college;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Student {

	private String name;
	private String city;
	private String mobileNo;
	private String gender;
	private String status = "Pass";
	
	private College college;
	private Marks marks;
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
		
	public void display() {
		System.out.println("Name: "+name+"        "+"City: "+city+"\n");
		System.out.println("Mobile No: "+mobileNo+"          "+"Gender: "+gender+"\n");
		System.out.println("College: "+getCollege().getClgName()+"    "+"Enrollment No: "+getCollege().getRollno()+"\n");
		
		Set<Entry<String, String>> set=marks.entrySet();  
	    Iterator<Entry<String, String>> itr=set.iterator();  
	    while(itr.hasNext()){  
	        Entry<String,String> entry=itr.next();  
	        System.out.println("Subject:   "+entry.getKey()+"     Grade:    "+entry.getValue()+"\n");
	        if(entry.getValue().equals("A") || entry.getValue().equals("A+")|| entry.getValue().equals("B") ||entry.getValue().equals("B+") || entry.getValue().equals("C") ||entry.getValue().equals("C") ) {
	        	continue;
	        }
	        else {
	        	setStatus("Fail");
	        }
	    }  
		
		System.out.println("Status: "+status);
	}
}
