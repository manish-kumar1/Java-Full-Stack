import java.util.Scanner;
class Tempareture{
	public static void solve(int temp){
		if(temp >= 17 && temp <= 34){
			System.out.println("cooldy");
		}
		else if(temp >= 35){
			System.out.println("Hotest");
		}
		else{
			System.out.print("coolest");
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temperature");
		int temp = sc.nextInt();
		solve(temp);
		sc.close();
	}
}