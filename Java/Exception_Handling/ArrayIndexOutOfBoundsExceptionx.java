class Demo{
	public static void main(String args[]){
		int[] ar = new int[]{1,2,3,4,5};
		try{
			int x = ar[6];
		}
		catch(IndexOutOfBoundsException e){
			System.out.println(e);
		}
		System.out.println("rest of code");
	}
}