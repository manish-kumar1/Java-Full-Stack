
package in.codechef.problems;

import java.util.Scanner;

class Notes2000{
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int total_rupees = n * 2000;
		int valid_note = 500;
		
		int number_of_notes = total_rupees / valid_note;
		System.out.println(number_of_notes);
		
		sc.close();
	}
}