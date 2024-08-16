import java.util.Scanner;
class MaxMin{
	public static int fun(int arr[]){
		int sz = arr.length;
		int temp = 123356;
		int mini = 0;
		for(int i = 0; i < sz; i++){
			if(arr[i] < temp){
				mini = arr[i];
				temp = mini;
			}
		}
		return mini;
	}
	public static int solve(int []arr){
		int n = arr.length;
		int temp = -111;
		int maxi = 0;
		for(int i = 0; i < n; i++){
			if(arr[i] >= temp){
				maxi = arr[i];
				temp = maxi;
			}
		}
		return maxi;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		int []arr = new int[size];
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		int maxi = solve(arr);
		System.out.println("Maximum " + maxi);
		int mini = fun(arr);
		System.out.println("Minimum " + mini);
		sc.close();
	}
}