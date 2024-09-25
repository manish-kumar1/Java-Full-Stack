package in.codechef.problems;

import java.util.Scanner;

public class TaxInChefland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			
			int x = sc.nextInt();
			
			if(x > 100) {
				System.out.println(x - 10);
			}
			else {
				System.out.println(x);
			}
		}
		sc.close();
	}

}
