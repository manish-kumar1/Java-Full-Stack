
package in.codechef.problems;

import java.util.Scanner;

class HeatWave{
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
			
		if(y > x) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		sc.close();
		
	}
}