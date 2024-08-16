class ReplaceMethods{
	public static void main(String args[]){
		String s = "This is Demo";
		System.out.println(s.replace("is", "was"));
		System.out.println(s.replaceFirst("is", "was"));
		System.out.println(s.replaceAll("is","was"));
		System.out.println(s.replaceAll("is(.)", "was"));
		System.out.println(s.replaceAll("is(.*)", "was"));
	}
}