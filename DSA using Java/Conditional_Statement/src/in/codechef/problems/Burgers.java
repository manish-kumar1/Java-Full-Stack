package in.codechef.problems;

import java.util.Scanner;

public class Burgers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(x > y) {
				System.out.println(y);
			}
			else if(y > x) {
				System.out.println(x);
			}
			else {
				System.out.println(x);
			}
		}
		sc.close();
	}
}
