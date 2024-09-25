package in.codechef.problems;

import java.util.Scanner;

public class CourseRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            
            if(m-k >= n){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
	}
}
