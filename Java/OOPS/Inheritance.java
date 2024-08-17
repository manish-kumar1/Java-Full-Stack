class Inheritance{
	
	void show(){
		System.out.println("Hello World");
	}
}
class Inherit extends Inheritance{
	void display(){
		System.out.println("Hello Duniya");
	}
	public static void main(String args[]){
		Inherit obj = new Inherit();
		obj.show();
		obj.display();
	}
}