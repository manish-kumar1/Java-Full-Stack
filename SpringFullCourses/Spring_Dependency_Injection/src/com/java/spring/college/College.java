package com.java.spring.college;

public class College {

	private static final String name = "IES College of Technology, Bhopal";
	private static final int code = 0177;
	private Course course;
	
	public void setCourse(Course course) {
		this.course = course;
	}
	public Course getCourse() {
		return course;
	}
	public void display() {
		
		System.out.println("Name:  "+name);
		System.out.println("Code:  "+code);
		System.out.println("Course Name:  "+getCourse().getCourseName());
		System.out.println("Fees:  "+getCourse().getFees());
		System.out.println("Years:  "+getCourse().getYears());
	}
	
}
