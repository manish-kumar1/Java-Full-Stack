import java.util.Scanner;
class Desicion{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("Enter the age to check valid or not");
		age = sc.nextInt();
		
		if(age >= 18){
			System.out.println("You are Eligible for vote");
		}
		System.out.println("Thank You....");
		sc.close();
	}
}