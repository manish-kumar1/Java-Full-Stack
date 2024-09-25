package in.codechef.problems;

import java.util.Scanner;

public class Reach5Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x+(y) >= 2000){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
		sc.close();
	}

}
