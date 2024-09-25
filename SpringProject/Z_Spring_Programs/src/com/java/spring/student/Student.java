package com.java.spring.student;

public class Student {

	private String idx;
	private String name;
	private String email;
	private String Course;
	
	public String getIdx() {
		return idx;
	}
	public void setIdx(String idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	
	public void display() {
		System.out.println("Id:  "+idx);
		System.out.println("Name:  "+name);
		System.out.println("Email:  "+email);
		System.out.println("Course:  "+Course);
		
		System.out.println("-----------------------");
	}
	
}
