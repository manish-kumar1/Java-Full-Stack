package in.codechef.problems;

import java.util.Scanner;

public class PracticeMakesUsPerfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = 4;
		int count = 0;
		int x;
		while(t-->0){
		    
		    x = sc.nextInt();
		    if(x >= 10){
		        count++;
		    }
		}
        System.out.println(count);
        sc.close();
	}

}
