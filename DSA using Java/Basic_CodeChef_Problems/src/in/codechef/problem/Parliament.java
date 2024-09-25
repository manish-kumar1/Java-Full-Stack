package in.codechef.problem;

import java.util.Scanner;

public class Parliament {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    if(x-y <= y){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
		sc.close();
	}

}
