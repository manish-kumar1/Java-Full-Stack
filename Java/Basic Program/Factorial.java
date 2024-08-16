import java.util.Scanner;
class Factorial{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int fact = 1;
		int i = 1;
		for( ; i <= num; i++){
			fact = fact * i;
		}
		System.out.println(fact);
		
	}
}