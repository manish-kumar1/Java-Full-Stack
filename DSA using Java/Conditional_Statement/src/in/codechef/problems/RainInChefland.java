package in.codechef.problems;

import java.util.Scanner;

public class RainInChefland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int x = sc.nextInt();
		    
		    if(x < 3){
		        System.out.println("LIGHT");
		    }
		    else if(x >= 3 && x < 7){
		        System.out.println("MODERATE");
		    }
		    else{
		        System.out.println("HEAVY");
		    }
		}
        sc.close();
	}

}
