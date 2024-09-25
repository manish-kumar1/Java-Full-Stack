package in.codechef.problems;

import java.util.Scanner;

public class ChefAndMasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    if(x*100 < y*10){
		        System.out.println("Disposable");
		    }
		    else{
		        System.out.println("Cloth");
		    }
		}
        sc.close();
	}

}
