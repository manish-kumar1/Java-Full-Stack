package collection_framework;

import java.util.*;
class ArrayListInteger{
	public static void main(String args[]) {
		ArrayList<Integer> li = new ArrayList<>();
		li.add(34);
		li.add(13);
		li.add(41);
		li.add(32);
		li.add(23);
		
//		System.out.println(li);
//		
//		// ArrayList traversal
//		for(int i = 0; i < li.size(); i++) {
//			System.out.print(li.get(i)+" ");
//		}
//		
//		System.out.println();
//		
//		Collections.sort(li);
//		System.out.println(li);
		
		Collections.reverse(li);
		System.out.println(li);
		
		Collections.swap(li, 0, 4);
		System.out.println(li);
		
		int x = Collections.max(li);
		System.out.println(x);
		
		int min = Collections.min(li);
		System.out.println(min);
		
		int idx = li.indexOf(32);
		System.out.println("Index: "+idx);
		
		
	}
}