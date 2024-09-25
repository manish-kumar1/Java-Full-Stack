package in.codechef.problems;

import java.util.Scanner;

public class TVDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    if(a-x < b-y){
		        System.out.println("First");
		    }
		    else if(a-x > b-y){
		        System.out.println("Second");
		    }
		    else{
		        System.out.println("Any");
		    }
		}
		sc.close();
	}

}
