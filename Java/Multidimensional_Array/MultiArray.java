class MultiArray{
	public static void main(String args[]){
		int[][] a = {{10,20,30,40},{50,60},{70,80,90}};
		System.out.println(a);  // [[I@3fee733d here [[ this represent the 2d Array and I 			//represent the Integer value
		System.out.println(a.length); // print the number of row (3)
		System.out.println(a[0]);  // [I@5acf9800 here [ this represent the 1-d Array and I 		//represent the Integer value

		System.out.println(a[0][1]); // 20
		System.out.println(a[1][0]);  // 50
		
		System.out.println("Accessing these Element via loop");
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
	}
}