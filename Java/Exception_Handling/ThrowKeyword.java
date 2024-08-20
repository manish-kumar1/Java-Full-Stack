import java.util.Scanner;
class YoungerAgeException extends RuntimeException{
	YoungerAgeException(String msg){
		super(msg);
	}
}
class Test{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age..");
		int age = sc.nextInt();
		try{
			if(age < 18){
				throw new YoungerAgeException("You are not eligible for voting..");
			}
			else{
				System.out.println("You can vote successfully");
			}
		}
		catch(YoungerAgeException ex){
			ex.printStackTrace();
		}
		System.out.println("Rest of code");
	}
}