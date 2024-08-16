class NewString{
	public static void main(String args[]){
		String s1 = new String("Mister");
		String s2 = new String("Mister");
			
		boolean isTrue = s1.equals(s2);
		System.out.println(isTrue);
		System.out.println(s1 == s2);
		
		String st1 = "Kumar";
		String st2 = "Kumar";
		System.out.println(st1 == st2);
	}
}