package in.codechef.problems;

import java.util.Scanner;

public class BullOrBear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    if(y > x){
		        System.out.println("PROFIT");
		    }
		    else if(y < x){
		        System.out.println("LOSS");
		    }
		    else{
		        System.out.println("NEUTRAL");
		    }
		}
		sc.close();

	}

}
