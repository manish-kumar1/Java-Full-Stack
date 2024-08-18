// nested interface
interface A{
	void show();
	interface B{
		void msg();
	}
}
class C implements A, A.B{
	public void show(){
		System.out.println("method of interface A class");
	}
	public void msg(){
		System.out.println("method of interface B class");
	}
}
class Demo{
	public static void main(String args[]){
		A a = new C();
		a.show();
		
		A.B obj = new C();
	
		obj.msg();
	}
}