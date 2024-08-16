import java.util.Scanner;
class ForLoop{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		// print 1 to n natural number
		int n = sc.nextInt();
		for(int  i = 0; i <= n; i++){
			System.out.print(i+" ");
		}
		sc.close();
	}
}