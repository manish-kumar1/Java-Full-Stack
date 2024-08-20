class Employee{
	int empid;
	String name;
	static String company = "Intuit";
	
	Employee(int id, String name){
		this.empid = id;
		this.name = name;
	}
	void display(){
		System.out.println(empid+" "+name+" "+company);
	}
	public static void main(String args[]){
		Employee emp = new Employee(111, "Alex");
		emp.display();
		Employee emp2 = new Employee(123, "Robin");
		emp2.display();
	}
}