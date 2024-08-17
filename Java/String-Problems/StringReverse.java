import java.util.Scanner;
class StringReverse{
	public static void main(String argsp[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to check given string is pelindrome or not");
		String s = sc.nextLine();
		String rev = "";c
		for(int i = s.length()-1; i >= 0; i--){
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		if(s.equals(rev)){
			System.out.println(s + " is a Pelindrome String");
		}
		else{
			System.out.println(s + " is not Pelindrome String");
		}
	}
}