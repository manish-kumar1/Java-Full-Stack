class EndsWith{
	public static void main(String args[]){
		String s = "Welcome to Javatpoint.com";
		Boolean isTrue = s.endsWith(".com");
		System.out.println(isTrue);
		System.out.println(s.endsWith("m"));
		System.out.println(s.endsWith("Com")); //false case sensetivee
		if(s.endsWith("Javatpoint.com")){
			System.out.println("Inside the block");
		}
		else{
			System.out.println("Out side the block");
		}
		System.out.println(s.endsWith(""));
		System.out.println(s.endsWith(" "));
	}
}