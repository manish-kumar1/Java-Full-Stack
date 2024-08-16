class AnonymousArray{
	public static void main(String args[]){
		int ans = solve(new int[][]{{10, 20, 30},{40,50},{60,70,80}});
		System.out.println(ans);
	}
	static int solve(int[][] a){
		int total = 0;
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				total = total + a[i][j];
			}
		}
		return total;
	}
}