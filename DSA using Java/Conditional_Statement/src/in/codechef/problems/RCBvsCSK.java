package in.codechef.problems;

import java.util.Scanner;

public class RCBvsCSK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int runs = x-y;
		if(runs >= 18){
		    System.out.println("RCB");
		}
        else{
            System.out.println("CSK");
        }
        sc.close(); 
	}

}
