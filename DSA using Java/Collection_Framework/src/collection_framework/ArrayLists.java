package collection_framework;

import java.util.*;

class ArrayLists{
	public static void main(String args[]) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Python");
		list.add("C++");
		list.add("JavaScript");
		list.add("ReactJs");
		System.out.println(list);
		
		java.util.Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		list.set(1, "PythonO.2");
		System.out.println(list);
		
		System.out.println(list.getFirst()); // return the first element 
		System.out.println(list.getLast());  // return the last element
		
		System.out.println(list.get(3));    // return the element which at index 3
		
		list.remove(1); // remove the element at specific index
		System.out.println(list);
		
		//list.removeFirst();  remove the first element
		//list.removeLast();   remove the last element
		
		list.addFirst("Ruby");  // add the element at the first index
		System.out.println(list);
		
		list.addLast("DSA");
		System.out.println(list);  // add the element at last index
		
		Collections.sort(list);
		System.out.println(list);
		
		for(String st : list) {
			System.out.println(st);
		}
		
		
	}
}