class Anonymous{
	public static void fun(int a[]){
		int total = 0;
		for(int x : a){
			total = total + x;
		}
		System.out.println(total);
	}
	public static void main(String args[]){
		fun(new int[]{10, 20, 30});
	}
}