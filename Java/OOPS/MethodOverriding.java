class Test{
	void show(){
		System.out.println("1");
	}
}
class Demo extends Test{
	void show(){
		System.out.println("2");
	}
	public static void main(String args[]){
		// Test class ke method ko hi call kar sakte hai
		Test t = new Test();
		t.show();
		
		// Demo class ke method ko hi call kar sakte hai
		Demo d = new Demo();
		d.show();
	}
}