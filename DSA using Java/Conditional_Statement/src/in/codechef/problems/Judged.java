package in.codechef.problems;

import java.util.Scanner;

public class Judged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    int e = sc.nextInt();
		    
		    int total_likes = a+b+c+d+e;
		    if(total_likes >= 4){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
		sc.close();

	}

}
