package com.java.spring.student;

public class Student {

	private int rollno;
	private String name;
	private String email;
	private String course;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
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
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void display() {
		System.out.println("Roll No:  "+rollno);
		System.out.println("Name:  "+name);
		System.out.println("Email:  "+email);
		System.out.println("Course:  "+course);
		
		System.out.println("-------------------------");
	}
}
