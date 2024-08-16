class Int_To_Byte{
	public static void main(String args[]){
		int a = 129;
		byte b;
		//b = a;  // error: incompatible types: possible lossy conversion from int to byte
		b = (byte)a;
		System.out.print(b);
	}
}