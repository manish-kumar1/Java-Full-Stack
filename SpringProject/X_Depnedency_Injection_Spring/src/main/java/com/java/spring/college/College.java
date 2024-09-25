package com.java.spring.college;


public class College {

	private String clgName = "IES College of Technology, Bhopal";
	private String rollno;
	
	
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	
	@Override
	public String toString() {
		return "College [College =" + clgName + ", Enrollment No =" + rollno + "]";
	}
	
}
