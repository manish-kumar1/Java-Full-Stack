class StringConcat{
	public static void main(String args[]){
		String s1 = "Hello";
		String s2 = "Java";
		String s3 = "Read";
		System.out.println(s1.concat(" "+s2).concat(" "+s3));
		System.out.println(s1.concat("!!!"));
		System.out.println(s2.concat("@").concat(s3));
	}
}
