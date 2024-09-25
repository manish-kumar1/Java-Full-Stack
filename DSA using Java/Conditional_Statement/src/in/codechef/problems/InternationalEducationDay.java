package in.codechef.problems;

import java.util.Scanner;

public class InternationalEducationDay {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x*z > y*z) {
			System.out.println(x*z);
		}
		else {
			System.out.println(y*z);
		}
		sc.close();
	}
}
