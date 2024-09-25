package in.codechef.problem;

import java.util.Scanner;

public class FindRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    var a = sc.nextInt();
		    var b = sc.nextInt();
		    
		    System.out.println(a%b);
		}
		
        sc.close();
	}

}
