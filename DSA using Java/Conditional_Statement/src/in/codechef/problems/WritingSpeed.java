package in.codechef.problems;

import java.util.Scanner;

public class WritingSpeed {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x*5 <= 60) {
			System.out.print("YES");
		}
		else {
			System.out.print("NO");
		}
		sc.close();
	}
}
