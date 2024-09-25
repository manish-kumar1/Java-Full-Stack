package in.codechef.problems;

import java.util.Scanner;

public class Pelindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new  Scanner(System.in);
		
		String st = sc.nextLine();
		String temp = st;
		String ans = "";
		for(int i = st.length()-1; i >= 0; i--) {
			char ch =st.charAt(i);
			ans = ans + String.valueOf(ch);
		}
		if(temp.equals(ans)) {
			System.out.println("Pelindrome");
		}
		else {
			System.out.println("Not Pelindrome");
		}
		sc.close();
	}

}
