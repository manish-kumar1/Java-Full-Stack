class ConversionMethods{
	public static void main(String args[]){
		String s = "misTer";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

		int a = 10, b = 20;
		System.out.println(a+b);
		String s1 = String.valueOf(a);  // conversion int to string
		System.out.println(s1.getClass().getSimpleName());  // check string type
		System.out.println(s1+b);
		
		char[] ch = s.toCharArray();
		for(char c : ch){
			System.out.print(c+" ");
		}
	}
}