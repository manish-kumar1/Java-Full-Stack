package in.codechef.problems;

import java.util.Scanner;

public class FootballTraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
	    
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    
	    if(x > y){
	        System.out.println("FREEKICK");
	    }
	    else{
	        System.out.println("PENALTY");
	    }
		
        sc.close();
	}

}
