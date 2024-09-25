package in.codechef.problems;

import java.util.Scanner;

public class TheMangoTruck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    
		    z = z - y;
		    System.out.println(z/x);
		}
		sc.close();
	}
}
