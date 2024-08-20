import java.util.Scanner;
class PrimeNumberException extends RuntimeException{
	PrimeNumberException(String msg){
		super(msg);
	}
}
class Demo{
	static boolean solve(int n){
		int i = 2;
		boolean isPrime = true;
		while(n > i){
			if(n % i == 0){
				isPrime = false;
				break;
			}
			i++;
		}
		if(isPrime == true){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isTrue = solve(n);
		if(isTrue == true){
			throw new PrimeNumberException("This is Prime..");
			//System.out.println("what happend"); // error: unreachable statement
		}
		else{
			System.out.println("Not Prime number exception");
		}
		sc.close();
	}
}