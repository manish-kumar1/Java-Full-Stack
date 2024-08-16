class Conversion{
	public static void main(String args[]){
		int a = 129;
		byte b;
	        // b = a;   // error: incompatible types: possible lossy conversion from int to byte
		// solution
		b = (byte)a;
	        System.out.println(b);
	}
}

