import java.util.*;
class EqualsIgnoreCase2{
	public static void main(String args[]){
		String s = "SanJu";
		ArrayList<String> list = new ArrayList<>();
		list.add("Rani");
		list.add("Kajal");
		list.add("Ritesh");
		list.add("Mandip");
		list.add("sanju");
		list.add("Anshika");
		for(String str : list){
			if(str.equalsIgnoreCase(s)){
				System.out.println("String is Present");
			}
			else{
				System.out.println("String is Not Present");
			}
		}
	}
}