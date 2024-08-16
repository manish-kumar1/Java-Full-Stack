import java.util.Scanner;
class Add{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Enter the first value");
		a = sc.nextInt();
		System.out.println("Enter the second value");
		b = sc.nextInt();
		
		int sum = a+b;
		System.out.println(sum);
		sc.close();
	}
}