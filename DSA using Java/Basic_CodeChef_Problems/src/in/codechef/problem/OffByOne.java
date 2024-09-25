package in.codechef.problem;

import java.util.Scanner;

public class OffByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println(((x+y)*10)+1);
		sc.close();
	}

}
