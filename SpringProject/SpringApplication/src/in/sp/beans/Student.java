package in.sp.beans;

public class Student {
	
	private String name;
	private int rollNo;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void display() {
		System.out.println("name : "+name);
		System.out.println("rollNo "+rollNo);
		System.out.println("city : "+city);
	}
	
}
