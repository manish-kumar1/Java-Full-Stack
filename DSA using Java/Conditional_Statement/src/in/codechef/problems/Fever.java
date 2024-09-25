package in.codechef.problems;

import java.util.Scanner;

public class Fever {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int x = sc.nextInt();
		    if(x > 98){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
		sc.close();
	}

}
