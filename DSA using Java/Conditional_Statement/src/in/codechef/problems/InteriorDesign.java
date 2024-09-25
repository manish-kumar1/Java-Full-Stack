package in.codechef.problems;

import java.util.Scanner;

public class InteriorDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int x1 = sc.nextInt();
		    int y1 = sc.nextInt();
		    int x2 = sc.nextInt();
		    int y2 = sc.nextInt();
		    
		    if(x1+y1 <= x2+y2){
		        System.out.println(x1+y1);
		    }
		    else{
		        System.out.println(x2+y2);
		    }
		}
        sc.close();
	}

}
