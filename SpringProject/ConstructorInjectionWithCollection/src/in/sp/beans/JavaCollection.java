package in.sp.beans;

import java.util.Iterator;
import java.util.List;

public class JavaCollection {

	private int id;
	private String name;
	private List<String> list;
	
	public JavaCollection(int id, String name, List<String> list) {
		this.id = id;
		this.name = name;
		this.list = list;
	}
	public void display() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		
		Iterator<String> itr = list.iterator();
		System.out.print("List- ");
		while(itr.hasNext()) {
			System.out.print(itr.next()+", ");
		}
	}
}
