package in.codechef.problem;

import java.util.Scanner;

public class NumberOfCredits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
//			int z = sc.nextInt();
			
			System.out.println(x*4+y*2);
		}
		sc.close();
	}

}
