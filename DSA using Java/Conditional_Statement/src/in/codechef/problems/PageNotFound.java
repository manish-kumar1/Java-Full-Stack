package in.codechef.problems;

import java.util.Scanner;

public class PageNotFound {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x == 404) {
			System.out.print("NOT FOUND");
		}
		else {
			System.out.print("FOUND");
		}
		sc.close();
	}
}
