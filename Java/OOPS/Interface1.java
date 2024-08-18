interface Animal{
	//public static final String name;  data member
	public abstract void eat();
	public abstract void run();
	void sound();
	
	// default or static void method_name(){} concrete method can declear in java 8
	// private return_type method_name() {} concrete method can declear in java 9
	static void feel(){
		System.out.println("All animals have feeling");
	}
}
class Dog implements Animal{
	public void eat(){
		System.out.println("A 'Black Dog' is eating rice chiken with black dog");
	}
	public void run(){
		System.out.println("Yes, 'black dog' run fast because of black dog");
	}
	public void sound(){
		System.out.println("sometimes black dog bark");
	}
	public static void main(String args[]){
		Dog d = new Dog();
		d.eat();
		d.run();
		d.sound();
	}
}
	