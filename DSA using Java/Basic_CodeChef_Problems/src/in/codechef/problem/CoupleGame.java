package in.codechef.problem;

import java.util.Scanner;

public class CoupleGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int g = sc.nextInt();
		    int b = sc.nextInt();
		    
		    System.out.println(b-g);
		}
		sc.close();

	}

}
