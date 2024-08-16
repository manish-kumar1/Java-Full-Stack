import java.util.*;
class EqualsMethod2{
	public static void main(String args[]){
		String s = "Mister";
		ArrayList<String> list = new ArrayList<>();
		list.add("Ravi");
		list.add("Aman");
		list.add("Alex");
		list.add("Mandip");
		list.add("Mister");
		for(String str : list){
			if(str.equals(s)){
				System.out.println("Yes Present in Block");
			}
			else{
				System.out.println("Not Present in Block");	
			}
		}
		String str1 = "Mister";
		String str2 = "Mis";
		if(str1 == str2){
			System.out.println("Hello World");
		}
		else{
			System.out.println("Hello Duniya mere dost");
		}
	}
}