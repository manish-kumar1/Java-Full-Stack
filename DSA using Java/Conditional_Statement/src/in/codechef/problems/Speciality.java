package in.codechef.problems;

import java.util.Scanner;

public class Speciality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    
		    if(x > y && x > z){
		        System.out.println("Setter");
		    }
		    else if(y > z && y > x){
		       System.out.println("Tester");
		    }
		    else{
		        System.out.println("Editorialist");
		    }
		}
		sc.close();

	}

}
