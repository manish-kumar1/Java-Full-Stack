package in.codechef.problem;

import java.util.Scanner;

public class ProfitIncreament {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            int increasePercentage = (x/10)+y;
            System.out.println(increasePercentage);
        }
        sc.close();
	}

}
