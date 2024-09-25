package in.sp.beans;

public class Employee {

	private String name;
	private int salary;
	private Company company;
	
	public Employee(String name, int salary, Company company) {
		this.name = name;
		this.salary = salary;
		this.company = company;
	}
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Company- "+company);
		
		System.out.println("----------------------------");
	}
}
