import java.util.Scanner;
class ReverseDigit{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit for reversing");
		int digit = sc.nextInt();
		int sum = 0;
		while(digit != 0){
			int rem = digit % 10;
			sum = sum * 10 + rem;
			digit = digit / 10;
		}
		System.out.println(sum);
	}
	
}