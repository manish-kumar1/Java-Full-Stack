package in.codechef.problems;

import java.util.Scanner;

public class ReachHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    if(y <= x*5){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
		sc.close();
	}

}
