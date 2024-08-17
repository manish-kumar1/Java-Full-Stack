import java.util.Scanner;
class MaxRepeatingAlphabat{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		s = s.replaceAll(" ", "");
		int[] arr = new int[127];
		for(int i = 0; i < s.length(); i++){
			arr[s.charAt(i)] = arr[s.charAt(i)]+1;
		}
		int maxi = -1;
		char maxChar = ' ';
		for(int i = 0; i < s.length(); i++){
			if(maxi < arr[s.charAt(i)]){
				maxi = arr[s.charAt(i)];
				maxChar = s.charAt(i);
			}
		}
		System.out.println("Maximum Repeating Character is " + maxChar);
		sc.close();
	}
}