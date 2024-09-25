package in.codechef.problems;

import java.util.Scanner;

public class TelevisionChannels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x % 2 == 0){
		    System.out.print(x/2);
		}
		else{
		    System.out.print((x+1)/2);
		}
        sc.close();
	}

}
