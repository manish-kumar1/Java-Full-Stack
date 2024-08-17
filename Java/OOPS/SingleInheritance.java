class A{
	void showA(){
		System.out.println("A class ka Method");
	}
}
class B extends A{
	void showB(){
		System.out.println("B class ka Method");
	}
	public static void main(String args[]){
		A obj = new A();
		obj.showA();
		//obj.showB();
		
		B ob = new B();
		ob.showA();
		ob.showB();
	}
}