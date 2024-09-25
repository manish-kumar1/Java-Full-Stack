package com.java.collection.constructor;

import java.util.List;

public class CS_Student {

	private String enrollment;
	private String name;
	private String email;
	private List<String> skills;
	
	public CS_Student(String enrollment, String name, String email, List<String> skills) {
		super();
		this.enrollment = enrollment;
		this.name = name;
		this.email = email;
		this.skills = skills;
	}
	
	public void display() {
		System.out.println("Enrollment:  "+enrollment);
		System.out.println("name:  "+name);
		System.out.println("Email:  "+email);
		System.out.println("Skills:  "+skills);
	}
}
