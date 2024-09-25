package in.sp.beans;

public class Student {
		
	private String name;
	private int fees;
	private String email;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void display() {
		System.out.println("Name :"+name);
		System.out.println("Fess :"+fees);
		System.out.println("Email :"+email);
		
		System.out.println("-----------------");
	}
	
}
