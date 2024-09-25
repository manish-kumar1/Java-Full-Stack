package in.codechef.problems;

import java.util.Scanner;

public class TastyDecisions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    if(2*x > 5*y){
		        System.out.println("Chocolate");
		    }
		    else if(5*y > 2*x){
		        System.out.println("Candy");
		    }
		    else{
		        System.out.println("Either");
		    }
		}
        sc.close();
	}

}
