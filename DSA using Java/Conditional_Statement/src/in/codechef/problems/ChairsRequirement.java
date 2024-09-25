package in.codechef.problems;

import java.util.Scanner;

public class ChairsRequirement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    if(x >= y){
		        System.out.println(x-y);
		    }
		    else{
                System.out.println(0);
		    }
		}
        sc.close();
	}

}
