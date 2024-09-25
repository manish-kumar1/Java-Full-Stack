package in.codechef.problems;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int x = sc.nextInt();
		    int sum = 0;
		    while(x != 0){
		        int rem = x % 10;
		        sum = sum + rem;
		        x = x / 10;
		    }
		    System.out.println(sum);
		}
		sc.close();
	}

}
