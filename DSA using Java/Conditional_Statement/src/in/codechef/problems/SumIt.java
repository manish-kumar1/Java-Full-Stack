package in.codechef.problems;

import java.util.Scanner;

public class SumIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    
		    if(x+y == z){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
		sc.close();
	}

}
