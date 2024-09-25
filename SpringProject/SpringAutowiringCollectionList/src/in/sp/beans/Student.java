package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	private String name;
	private int fees;
	
	@Autowired
	@Qualifier("createAddObj1")
	private Address address;
	
	@Autowired
	private Subjects subjects;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Fees: "+fees);
		System.out.println("Address- "+address);
		System.out.println("Subjects- "+subjects);
	}
	
}
