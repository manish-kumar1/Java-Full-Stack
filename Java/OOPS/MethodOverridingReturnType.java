class Employee{
	String emp_name;
	int emp_id;
	int emp_salary;
	Employee(String name, int id, int salary){
		this.emp_name = name;
		this.emp_id = id;
		this.emp_salary = salary;
	}
	
	Object show(){
		System.out.println(emp_name+" "+emp_id+" "+emp_salary);
		return null;
	}
}
class SoftwareDeveloper extends Employee{
	SoftwareDeveloper(String name, int id, int salary){
		super(name, id, salary);
	}
	@Override
	String show(){
		System.out.println(emp_name+" "+emp_id+" "+emp_salary);
		return null;
	}
	public static void main(String args[]){
		Employee em = new Employee("Alex", 1212, 1000);
		em.show();
		
		SoftwareDeveloper sd = new SoftwareDeveloper("John", 1023, 1400);
		sd.show();
	}
}