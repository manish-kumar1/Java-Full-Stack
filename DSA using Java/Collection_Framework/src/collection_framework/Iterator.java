
package collection_framework;

import java.util.*;
class Iterator{
	public static void main(String args[]) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(45);
		al.add(32);
		al.add(12);
		al.add(54);
		
		System.out.println(al);
		
		// iteration of ArrayList
		
		java.util.Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("--------Traversing ArrayList uisng for-each loop------");
		
		for(Integer el : al) {
			System.out.println(el);
		}
		// Methods in ArrayList
		
		System.out.println("------set()--------------");
		al.set(0, 50);  // set() used to set the value at specific index
		System.out.println(al);
		
		// sort();
		System.out.println("----sort()--------------");
		Collections.sort(al);
		System.out.println(al);
		
		//isEmpty()
		System.out.println("----isEmpty()-----");
		System.out.println(al.isEmpty());
	}
}