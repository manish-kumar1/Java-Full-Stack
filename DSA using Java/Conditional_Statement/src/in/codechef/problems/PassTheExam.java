package in.codechef.problems;

import java.util.Scanner;

public class PassTheExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    
		    if(a < 10 || b < 10 || c < 10){
		        System.out.println("Fail");
		    }
		    else{
		        if(a+b+c >= 100){
		            System.out.println("PASS");
		        }
		        else{
		            System.out.println("Fail");
		        }
		    }
		}
		sc.close();
	}

}
