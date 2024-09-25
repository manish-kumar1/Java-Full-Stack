package in.codechef.problem;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double y = sc.nextDouble();
		
		if(x % 5 == 0 && (y-x-0.50) >= 0){
		    y = y-x-0.50;
		}
        System.out.printf("%.2f%n",y);
        sc.close();
	}

}
