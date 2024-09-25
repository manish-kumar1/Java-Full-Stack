package in.codechef.problems;

import java.util.Scanner;

public class OctoberMarathon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x < 3){
		    System.out.println("GOLD");
		}
		else if(x >= 3 && x < 6){
		    System.out.println("SILVER");
		}
		else{
		    System.out.println("BRONZE");
		}
        sc.close();
	}

}
