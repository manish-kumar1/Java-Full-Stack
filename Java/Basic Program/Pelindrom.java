import java.util.Scanner;
class Pelindrom{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check given number is pelindrom or not");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while(num != 0){
			int rem = num % 10;
			sum = sum*10 + rem;
			num = num / 10;
		}
		if(sum == temp){
			System.out.println(sum+" is pelindrom number");
		}
		else{
			System.out.println(sum+" is not pelindrom number");
		}
	}
}