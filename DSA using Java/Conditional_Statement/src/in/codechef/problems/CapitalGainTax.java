package in.codechef.problems;

import java.util.Scanner;

public class CapitalGainTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(y > x){
		    System.out.println("INCREASED");
		}
		else if(y < x){
		    System.out.println("DECREASED");
		}
		else{
		    System.out.println("SAME");
		}
        sc.close();
	}

}
