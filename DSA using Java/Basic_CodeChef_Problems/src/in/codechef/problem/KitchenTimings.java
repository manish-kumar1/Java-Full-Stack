package in.codechef.problem;

import java.util.Scanner;

public class KitchenTimings {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			System.out.println(y-x);
		}
		sc.close();
	}
}
