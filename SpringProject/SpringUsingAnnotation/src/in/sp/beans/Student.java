package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("Deepak")
	private String name;
	
	@Value("100")
	private int rollno;
	
	@Value("85")
	private int marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void display() {
		System.out.println("Name :"+name);
		System.out.println("RollNo :"+rollno);
		System.out.println("Marks :"+marks);
	}
}
