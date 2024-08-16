import java.util.Scanner;
class Test{
 	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1 = new String();
		s1 = sc.nextLine();
		String s2 = new String();
		s2 = sc.nextLine();
		System.out.println(s1==s2);
		System.out.println(s1);
		System.out.println(s2);

		// string methods
		// equals();
		boolean Istrue = s1.equals(s2);
		System.out.println(Istrue);

		// equalsIgnoreCase
		boolean result = s1.equalsIgnoreCase(s2);
		System.out.println(result);

		

		
	}
}
		