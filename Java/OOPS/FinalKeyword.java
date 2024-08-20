class A{
	public static void main(String args[]){
		final int a = 10;
		a = a + 5;  // error: cannot assign a value to final variable a
		System.out.println(a);
	}
}