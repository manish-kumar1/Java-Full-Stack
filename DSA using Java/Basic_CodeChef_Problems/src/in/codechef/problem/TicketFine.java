package in.codechef.problem;

import java.util.Scanner;

public class TicketFine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int x = sc.nextInt();
		    int p = sc.nextInt();
		    int q = sc.nextInt();
		    
		    System.out.println((p-q)*x);
		}
		sc.close();
	}

}
