package in.codechef.problems;

import java.util.Scanner;

public class Math1Enrollment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    if(y > x){
		        System.out.println(y-x);
		    }
		    else{
		        System.out.println(0);
		    }
		}
        sc.close();
	}

}
