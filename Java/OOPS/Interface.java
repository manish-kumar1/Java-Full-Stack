interface Test{
	// public static final int a = 10;
	public abstract void show();
	default void display(){
		System.out.println("Concrete Method");
	}
}
interface Test2{
	public abstract void testShow();
	default void testDisplay(){
		System.out.println("Hello Test2 Interface");
	}
}
class Demo implements Test, Test2{  // multiple inheritance
	public void show(){
		System.out.println("Interface");
	}
	public void testShow(){
		System.out.println("Method body of Test2 interface");
	}
	public static void main(String args[]){
		//Test t = new Test();
		
		Demo d = new Demo();
		d.show();
		d.display();
		d.testShow();
		d.testDisplay();
	}
}