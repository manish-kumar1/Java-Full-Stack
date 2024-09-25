package in.codechef.problems;

import java.util.Scanner;

public class VolumeComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		
		int cubx = a*b*c;
		int cube =(int) Math.pow(x, 3);
		
		if(cubx == cube){
		    System.out.println("Equal");
		}
		else if(cubx > cube){
		    System.out.println("Cuboid");
		}
		else{
		    System.out.println("Cube");
		}
		sc.close();
	}

}
