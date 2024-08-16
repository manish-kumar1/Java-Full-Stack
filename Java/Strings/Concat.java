class Concat{
	public static void main(String args[]){
		String s1 = "Hello";
		String s2 = "Java";
		String s3 = "Read";

		String s4 = s1.concat(" " +s2);
		System.out.println(s4);
		// concating multiple string
		System.out.println(s1.concat(" "+s2).concat(" "+s3));
	}
}