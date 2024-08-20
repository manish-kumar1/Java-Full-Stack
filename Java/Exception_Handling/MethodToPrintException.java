class Demo{
	public static void main(String args[]){
		int[] ar = new int[]{1,2,3,4,5};
		try{
			int x = ar[6];
		}
		catch(IndexOutOfBoundsException e){
			//e.printStackTrace();   // print Exception_name, Description, stack trace.
			//System.out.println(e);  // // print Exception_name, Description
			//System.out.println(e.toString()); // print Exception_name, Description,
			System.out.println(e.getMessage());  // print Description only
			
		}
		System.out.println("rest of code");
	}
}