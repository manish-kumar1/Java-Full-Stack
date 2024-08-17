class ParameterizedConstructor{
	String empName;
	int empId;
	int empAge;
	ParameterizedConstructor(String name, int id, int age){
		this.empName = name;
		this.empId = id;
		this.empAge = age;
	}
	public static void main(String args[]){
		ParameterizedConstructor employee = new ParameterizedConstructor("Alex", 123, 20);
		System.out.println(employee.empName+" "+employee.empId+" "+employee.empAge);
		ParameterizedConstructor emp = new ParameterizedConstructor("Peter", 1023, 43);
		System.out.println(emp.empName+" "+emp.empId+" "+emp.empAge);
	}
}