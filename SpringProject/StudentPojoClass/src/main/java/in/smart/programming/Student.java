package in.smart.programming;

public class Student {

	private int rollNo;
	private String name;
	private String branch;
	private String cgpa;
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}
	
	public void display() {
		
		System.out.println("Roll No - "+rollNo);
		System.out.println("Name - "+name);
		System.out.println("Branch - "+branch);
		System.out.println("CGPA - "+cgpa);
		
		System.out.println("-------------------");
	}
	
}
