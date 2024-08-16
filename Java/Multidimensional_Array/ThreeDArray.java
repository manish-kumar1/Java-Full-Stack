class ThreeDArray{
	public static void main(String args[]){
		int[][][] a = { { {0,1,2}, {2,3,4}, {6,7,1} }, { {6,7, 1}, {8,9, 2}, {9,14, 22} } }; 
		
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; i++){
				for(int k = 0; k < a[i][j].length; k++){
					System.out.print(a[i][j][k] + " ");
				}
				System.out.println();
			}
		}
	}
}
