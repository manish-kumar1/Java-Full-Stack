class Add{
	static int add(int a, int b){
		return a+b;
	}
	static double add(double a, double b){
		return a+b;
	}
}
class UseAdd{
	public static void main(String argsp[]){
		System.out.println(Add.add(3, 5));
		System.out.println(Add.add(3.4, 5.5));
	}
}