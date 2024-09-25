package in.codechef.problems;

import java.util.Scanner;

class BatteryHealth{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-->0) {
			
			int x = sc.nextInt();
			
			if(x >= 80) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}