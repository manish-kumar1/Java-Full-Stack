class EqualsIgnoreCase{
	public static void main(String args[]){
		String s1 = "Welcome";
		String s2 = "WELCOME";
		String s3 = "Banglore";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s3.equalsIgnoreCase(s1));
	}
}
