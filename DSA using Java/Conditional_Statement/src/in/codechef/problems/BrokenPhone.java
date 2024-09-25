package in.codechef.problems;

import java.util.Scanner;

public class BrokenPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    
		    
		    if(a > b){
		        System.out.println("New Phone");
		    }
		    else if(a < b){
		        System.out.println("Repair");
		    }
		    else{
		        System.out.println("Any");
		    }
		}
		sc.close();

	}

}
