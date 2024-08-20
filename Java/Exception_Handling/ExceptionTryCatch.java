import java.util.Scanner;
class Demo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		try{
			c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("rest of code");
	}
}
			
			