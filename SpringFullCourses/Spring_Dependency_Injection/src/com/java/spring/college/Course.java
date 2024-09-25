package com.java.spring.college;

public class Course {

	private String courseName;
	private int fees;
	private String years;
	
	public String getCourseName() {
		return courseName;
	}
	public String getYears() {
		return years;
	}
	public int getFees() {
		return fees;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public void setYears(String years) {
		this.years = years;
	}
	@Override
	public String toString() {
		return " "+courseName+" "+fees+" "+years;
	}
	
}
