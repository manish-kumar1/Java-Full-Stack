import java.util.Scanner;
class Array{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Output");
		for(int i = 0; i < size; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int a : arr){   // for each loop
			System.out.print(a+" ");
		}
		sc.close();
	}
}