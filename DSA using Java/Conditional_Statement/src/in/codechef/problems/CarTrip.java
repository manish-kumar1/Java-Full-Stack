package in.codechef.problems;

import java.util.Scanner;

public class CarTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ss = new Scanner(System.in);
		int t = ss.nextInt();
		while(t-->0){
		    
		    int x = ss.nextInt();
		    
		    if(x <= 300){
		        System.out.println(300*10);
		    }
		    else{
		        System.out.println(x*10);
		    }
		}
        ss.close();
	}

}
