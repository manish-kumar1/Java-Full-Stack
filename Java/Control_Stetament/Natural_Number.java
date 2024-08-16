import java.util.Scanner;
class Natural_Number{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for print natural number");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			System.out.print(i+" ");
		}
		sc.close();
	}
}