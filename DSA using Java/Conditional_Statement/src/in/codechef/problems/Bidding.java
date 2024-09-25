package in.codechef.problems;

import java.util.Scanner;

public class Bidding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    
		    if(x > y && x > z){
		        System.out.println("Alice");
		    }
		    else if(y > x && y > z){
		        System.out.println("Bob");
		    }
		    else{
		        System.out.println("Charlie");
		    }
		}
        sc.close();
	}

}
