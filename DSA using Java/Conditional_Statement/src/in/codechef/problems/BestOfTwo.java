package in.codechef.problems;

import java.util.Scanner;

class BestOfTwo{
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-->0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a >= b) {
				System.out.println(a);
			}
			else {
				System.out.println(b);
			}
		}
		sc.close();
	}
}