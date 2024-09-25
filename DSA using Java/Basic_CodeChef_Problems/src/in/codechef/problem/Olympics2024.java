package in.codechef.problem;

import java.util.Scanner;

public class Olympics2024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int g = sc.nextInt();
		int s = sc.nextInt();
		int b = sc.nextInt();
		
		int models = 5-g+5-s+5-b;
		System.out.println(models);
		
		sc.close();
	}

}
 