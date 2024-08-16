class Expression{
	public static void main(String args[]){
		byte a = 10;
		byte b = 23;
		byte c;
	//	c = a + b; //  error: incompatible types: possible lossy conversion from int to byte
		// Solution
		c = (byte)(a+b);
		System.out.println(c);
	}
}