class Demo{
	public static void main(String argsp[]){
		String s = "hello";
		try{
			int x = Integer.parseInt(s);  // Exception
			System.out.println(x);
		}
		catch(RuntimeException e){
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
}