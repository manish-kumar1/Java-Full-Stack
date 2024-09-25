package in.codechef.problems;

import java.util.Scanner;

public class ScaleneTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            // Your code goes here
            
            if(a!=b && a!=c && c!= b){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        scanner.close();
	}

}
