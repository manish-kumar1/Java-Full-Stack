
package in.codechef.problems;

import java.util.Scanner;
class Olympics2023{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int g = sc.nextInt();
		int s = sc.nextInt();
		int b = sc.nextInt();
		
		int total_medals = g + s + b;
		System.out.println(15 - total_medals);
		sc.close();
	}
}