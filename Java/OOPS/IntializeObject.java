class IntializeObject{
	String name;
	int age;
	void intObj(String n, int a){
		name = n;
		age = a;
	}
	void display(){
		System.out.println(name +" "+age); 
	}
	public static void main(String args[]){
		IntializeObject obj = new IntializeObject();
		//intialize object value using reference varialble
		//obj.name = "Mister";
		//obj.age = 12;
		
		// intialize object value using method
		obj.intObj("Manish", 34);
		obj.display();
		System.out.println(obj.name + " " +obj.age);
	}
}