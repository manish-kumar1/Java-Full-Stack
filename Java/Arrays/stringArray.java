
import java.util.*;
class stringArray{
 	public static void main(String args[]){
		String sampleText = "Programmers love Java!\n" 
						+" User input with Java is so easy!\n"
						+" Just use the Scanner class.\n"
						+" Or maybe the Console or JOptionPane\n";
		Scanner scn = new Scanner(sampleText);
		System.out.println("First call: "+ scn.nextLine());
		System.out.println("Second call: "+ scn.nextLine());
		System.out.println("Third call: "+ scn.nextLine());
		System.out.println("Fourth call: "+ scn.nextLine());
		
		// next()
		scn = new Scanner(sampleText);
		System.out.println("First call: "+ scn.next());
		System.out.println("Second call: "+ scn.next());
		System.out.println("Third call: "+ scn.next());
		System.out.println("Fourth call: "+ scn.next());
		scn.close();
	}
}