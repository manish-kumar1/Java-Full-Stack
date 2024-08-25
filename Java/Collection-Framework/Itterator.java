
import java.util.*;
class ItteratorTest{
	public static void main(String arsg[]){
		
		List<Integer> l = new ArrayList<>();
		l.add(12);
		l.add(5);
		l.add(45);
		
		System.out.println(l); // [12, 5, 45]
		
		Iterator it = l.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}