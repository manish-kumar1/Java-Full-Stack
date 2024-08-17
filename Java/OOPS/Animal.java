class Animal{
	public void eat(){
		System.out.println("Dog is eating chiken with rice");
	}
	public void run(){
		System.out.println("Dog will run after eat");
	}
	public static void main(String args[]){
		
		System.out.println("Hello Animal");
		Animal dog = new Animal();
		dog.eat();
		dog.run();
		
		Birds sp = new Birds();
		sp.flyBird();
	}
}
class Birds{
	void flyBird(){
		System.out.println("Bird can fly very easily");
	}
}
	