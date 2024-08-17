class MethodOverloading{
	int add(int a, int b){  // non-static method
		return a+b;
	}
	int add(int a, int b, int c){  // non-static method
		return a+b+c;
	}
	public static void main(String args[]){
		
		MethodOverloading obj = new MethodOverloading();
		
		int ans = obj.add(10, 20);
		int result = obj.add(2, 4, 5);
		System.out.println(ans);
		System.out.println(result);
	}
}