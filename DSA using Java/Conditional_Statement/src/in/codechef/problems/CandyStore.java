package in.codechef.problems;

import java.util.Scanner;

public class CandyStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            // Your code goes here
            
            if(y > x){
                System.out.println((y-x)*2+x);
            }
            else{
                System.out.println(y);
            }
        }
        scanner.close();
	}

}
