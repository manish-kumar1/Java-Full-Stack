import java.util.Scanner;
class CharacterPrint{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for(int i = 0; i < s.length(); i++){
			if(i % 2 == 0){
				continue;
			}
			System.out.print(s.charAt(i) + " ");
		}
		sc.close();
	}
}
		