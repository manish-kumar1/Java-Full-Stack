import java.util.Scanner;
class charAtMethod{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		System.out.println("Enter the Index number to get char value");
		int i = sc.nextInt();
		if(i >= s.length() || i < 0){
			throw new StringIndexOutOfBoundsException(i);
		}
		System.out.println(s.charAt(i));
	}
}