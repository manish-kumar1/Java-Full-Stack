class Constructor{
	String name;
	int age;
	Constructor(){
		// here ceating a default constructor by the compiler
	}
	public static void main(String argsp[]){
		Constructor obj = new Constructor();
		Constructor obj2 = new Constructor();
		System.out.println(obj.name+" "+obj.age);
		System.out.println(obj2.name+" "+obj2.age);
	}
}