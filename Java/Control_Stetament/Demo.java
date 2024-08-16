import java.util.Scanner;
class Demo{
	public static void main(String args[]){	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int temp = sc.nextInt();
		int evenCount = 0, oddCount = 0;
		for(int i = 1; i <= temp; i++){
			System.out.print(i+" ");
			if(i % 2 == 0){
				evenCount++;
			}
			else{
				oddCount++;
			}
		}
		System.out.println();
		System.out.println(evenCount+" "+oddCount);
		sc.close();
	}
}