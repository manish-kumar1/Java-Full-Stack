class Employee{
	int id;
	void set(int id){
		this.id = id;
	}
	void get(){
		System.out.println(id);
	}
}
class Abc{
	public static void main(String args[]){
		Employee em = new Employee();
		em.set(20);
		em.get();
	}
}