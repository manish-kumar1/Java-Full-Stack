class Test{
	void show(int a){
		System.out.println("show method with int data type");
	}
	void show(double a){
		System.out.println("show method with double data type");
	}
}
class UseTest{
	public static void main(String args[]){
		Test obj = new Test();
		obj.show('a');
		obj.show(454.3f);
	}
}