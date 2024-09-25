package in.sp.beans;

public class Student {
	
	private String name;
	private int fees;
	private Address address;
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Fees: "+fees);
		System.out.println("Address- "+address);
	}
}
