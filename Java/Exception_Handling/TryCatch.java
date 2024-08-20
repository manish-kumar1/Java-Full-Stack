class TryCatch{
	public static void main(String args[]){
		TryCatch ob = new TryCatch();
		ob.divide();
		System.out.println("Hello");
	}
	void divide(){
		int a = 100, b = 0, c;
		try{
			c = a / b;
		}
		catch(RuntimeException ex){
			ex.printStackTrace();
		}
	}
}