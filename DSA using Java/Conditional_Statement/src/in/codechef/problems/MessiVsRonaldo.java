package in.codechef.problems;

import java.util.Scanner;

public class MessiVsRonaldo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int massi = 2*a+b;
		int ronaldo = 2*x+y;
		
		if(massi > ronaldo){
		    System.out.println("Messi");
		}
		else if(ronaldo > massi){
		    System.out.println("Ronaldo");
		}
		else{
		    System.out.println("Equal");
		}
        sc.close();
	}

}
