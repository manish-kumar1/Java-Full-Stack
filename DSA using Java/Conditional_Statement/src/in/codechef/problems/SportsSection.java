package in.codechef.problems;

import java.util.Scanner;

public class SportsSection {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x >= 8) {
			System.out.print("YES");
		}
		else {
			System.out.print("NO");
		}
		sc.close();
	}
}
