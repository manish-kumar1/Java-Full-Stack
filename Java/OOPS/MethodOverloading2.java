class OverloadMainMethod{
	public static void main(String args[]){
		System.out.println("Main Method with String array argument");
		main("abc");
		main(10);
	}
	public static void main(String str){
		System.out.println("Main Method with String argument");
	}
	static void main(int a){
		System.out.println("Main Method with integer value");
	}
}