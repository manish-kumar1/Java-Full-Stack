package in.codechef.problems;

import java.util.Scanner;

public class BobAtTheBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int w = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    
		    w = w + (x*z);
		    y = y * z;
		    
		    System.out.println(w-y);
		}

        sc.close();
	}

}
