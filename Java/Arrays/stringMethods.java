import java.util.Scanner;
class stringMethods{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n = sc.nextInt();
		String str[] = new String[n];
		System.out.println("Enter the programming language name");
		for(int i = 0; i < n; i++){
			str[i] = sc.nextLine();
 		}
		for(int i = 0; i < n; i++){
			System.out.print(str[i]+" ");
		}
		sc.close();
	}
}
		
		
		