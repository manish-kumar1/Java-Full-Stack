import java.util.Arrays;
import java.util.Scanner;
class BinarySearch{
	public static int solve(int nums[], int keyToSearch){
		// Built in method for Binary Search
		int ans = Arrays.binarySearch(nums, keyToSearch);
		System.out.println("Output " + ans);
		int left = 0;
		int right = nums.length-1;
		while(left < right){
			int mid = left + (right - left) / 2;
			if(nums[mid] == keyToSearch){
				return mid;
			}
			else if(nums[mid] > keyToSearch){
				right = mid - 1;
			}
			else{
				left = mid + 1;
			}
		}
		return -1;
	}		
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		int nums[] = new int[size];
		for(int i = 0; i < size; i++){
			nums[i] = sc.nextInt();
		}
		System.out.println("Enter the key for search");
		int keyToSearch = sc.nextInt();
		int ans = solve(nums, keyToSearch);
		if(ans >= 0){
			System.out.println("Element found at Index " + ans);
		}
		else{
			System.out.println("Element not found");
		}
		sc.close();
	}
}