package in.codechef.problems;

import java.util.Scanner;

public class FanPoll {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x > y && x > z) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		sc.close();
	}
}
