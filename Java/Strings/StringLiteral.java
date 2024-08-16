import java.util.Scanner;
class StringLiteral{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		char ch[] = {'s','t','r','i','n','g','s'};
		String s2 = new String(ch);
		int n = s1.length();
		System.out.println(s2);
		if(s1.trim().length() >= 1){
			System.out.println("Valid string");
			System.out.println(n);
		}
		else{
			System.out.println("Not valid string");
		}

		String s3 = new String("Hello");
		System.out.println(s3.isEmpty());
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();
	}
}