package in.smart.programming.PojoClassSpring;

public class Employee {

	private int empId;
	private String empName;
	private int salary;
	private String compName;
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	
	public void display() {
		System.out.println("Employee Id - "+empId);
		System.out.println("Employee Name - "+empName);
		System.out.println("Employee Salary - "+salary);
		System.out.println("Company Name - "+compName);
	}
}
