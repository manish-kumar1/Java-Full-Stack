package in.codechef.problem;

import java.util.Scanner;

public class ChefAndChocolates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();

		while (t-- > 0) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int z = scanner.nextInt();
			// Your code goes here

			x = x * 5;
			y = y * 10;

			System.out.println((x + y) / z);
		}
		scanner.close();
	}

}
