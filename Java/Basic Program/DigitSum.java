import java.util.Scanner;
class DigitSum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit to sum of digit");
		int digit = sc.nextInt();
		int sum = 0;
		while(digit != 0){
			int rem = digit % 10;
			sum = sum + rem;
			digit = digit / 10;
		}
		System.out.println(sum);
	}
}