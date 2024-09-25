package in.codechef.problem;

import java.util.Scanner;

public class FirstAndLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int x = sc.nextInt();
		    int xx = x;
		    String s = String.valueOf(x);
		    int leng = s.length();
		    
		    int lastDigit = x % 10;
		    
		    int firstDigit = (int) (xx/Math.pow(10, leng-1));
		    
		    System.out.println(lastDigit+firstDigit);
		    
		}
		sc.close();

	}

}
