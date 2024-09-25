package ci.dependent.object;

public class Employee {

	private String empid;
	private String name;
	private String email;
	
	private Address address;
	
	public Employee() {
		System.out.println("Default Constructor...");
	}

	public Employee(String empid, String name, String email, Address address) {
		super();
		this.empid = empid;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	public void display() {
		
		System.out.println("Employee Id:  "+empid);
		System.out.println("Name:  "+name);
		System.out.println("Email:  "+email);
		
		System.out.println("Address:  "+address.toString());
	}
	
}
