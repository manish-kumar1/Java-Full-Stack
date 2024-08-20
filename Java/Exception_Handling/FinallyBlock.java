import java.util.Scanner;
class FinallyBlock{
	public static void main(String argsp[]){
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		try{
			c = a/b;
			System.out.println(c);
		}
		catch(RuntimeException e){
			e.printStackTrace();
			return;  // with return, break, continue etc ke bad v finally block excute hoga
			//System.exit(0) is case mai finally block excute nahi hoga
		}
		finally{
			System.out.println("I am in finally block");
		}
		System.out.println("Rest of code");
		sc.close();
	}
}