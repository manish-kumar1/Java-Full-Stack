import java.util.Scanner;
class ArrayNewDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of row");
		int row = sc.nextInt();
		System.out.println("Enter the size of column");
		int col = sc.nextInt();
		int[][] ar = new int[row][col];
		System.out.println("Enter the Array Elements");
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){	
				ar[i][j] = sc.nextInt();
			}
		}
		System.out.println("Output");
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				System.out.print(ar[i][j] +" ");
			}
			System.out.println();
		}
		sc.close();
	}
}