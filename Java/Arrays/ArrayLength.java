import java.util.Scanner;
class ArrayLength{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Element");
		int arr[] = new int[5];
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] +" ");
		}
		System.out.println("Size of the array " + arr.length);
		sc.close();
	}
}