import java.util.Scanner;
class Prime{
	public static boolean solve(int number){
		boolean isPrime = true;
		int i = 2;
		while(number > i){
			if(number % i == 0){
				isPrime = false;
				return false;
			}
			i++;
		}
		if(isPrime == true){
			return true;
		}
		return false;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check given number is prime or not");
		int number = sc.nextInt();
		boolean ans = solve(number);
		System.out.println(ans);
	}
}