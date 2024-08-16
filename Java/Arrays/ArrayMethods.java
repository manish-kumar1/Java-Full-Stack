import java.util.Scanner;
class ArrayMethods{
	public static int searchItem(int []ar, int target){
		for(int i = 0; i < ar.length; i++){
			if(ar[i] == target){
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		int ar[] = new int[size];
		for(int i = 0; i < size; i++){
			ar[i] = sc.nextInt();
		}
		System.out.println("Enter the target element");
		int target = sc.nextInt();
		int ans = searchItem(ar, target);
		System.out.println("Index " + ans);
		sc.close();
	}
}