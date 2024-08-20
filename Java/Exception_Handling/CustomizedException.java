import java.util.Scanner;
class UnderAgeVoteException extends RuntimeException{
	UnderAgeVoteException(){
		super("You can't vote");
	}
	UnderAgeVoteException(String msg){
		super(msg);
	}
}
class Vote{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age..");
		int age = sc.nextInt();
		try{
			if(age < 18){
				throw new UnderAgeVoteException();
			}
			else{
				System.out.println("You can vote Welcome...\n");
				System.out.println("1. BJP   2. INC");
				System.out.println("3. BSP   4. Other");
				System.out.println();
				System.out.println("Enter Your choice..");
				int choice = sc.nextInt();
				switch(choice){
					case 1:
						System.out.println("Good Choice!");
						break;
					case 2:
						System.out.println("Koi BKL hi hoga jo INC ko choice karega");
						break;
					case 3:
						System.out.println("Lagba ashok singh ke la#@ cha#e");
						break;
					default:
						System.out.println("Kuch nahi bolunga nahi to vivad ho jayega");
				}
			}
		}
		catch(UnderAgeVoteException ex){
			ex.printStackTrace();
		}
		System.out.println("Thank You...");
	}
}