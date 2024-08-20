import java.util.Scanner;
class Exception{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		try{
			System.out.println(s.length());
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		System.out.println("rest of code");
	}
}