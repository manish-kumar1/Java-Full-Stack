package in.codechef.problems;

import java.util.Scanner;

public class PuzzleHunt {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x >= 6 && x <= 8){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
        sc.close();
	}
}
