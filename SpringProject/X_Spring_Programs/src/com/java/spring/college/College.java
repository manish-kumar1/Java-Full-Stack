package com.java.spring.college;

public class College {

	private static final String clgname = "IES College of Technology, Bhopal";
	private Course courses;
	
	private Student student;
	private Feculty feculty;
	
	public Course getCourses() {
		return courses;
	}
	public void setCourses(Course courses) {
		this.courses = courses;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Feculty getFeculty() {
		return feculty;
	}
	public void setFeculty(Feculty feculty) {
		this.feculty = feculty;
	}
	public static String getClgname() {
		return clgname;
	}
	
	
	
}
