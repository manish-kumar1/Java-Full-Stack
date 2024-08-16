import java.util.Scanner;
class Method{
	public static int solve(int first, int second){
		return first + second;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the frist number");
		int frist = sc.nextInt();
		System.out.println("Enter the second number");
		int second = sc.nextInt();
		
		int ans = solve(frist, second);
		System.out.println("Addition = "+ans);
	}
}