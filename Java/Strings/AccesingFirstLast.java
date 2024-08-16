import java.util.Scanner;
class AccesingFirstLast{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		System.out.println("first char " + s.charAt(0));
		System.out.println("last char " + s.charAt(s.length()-1));
	}
}
