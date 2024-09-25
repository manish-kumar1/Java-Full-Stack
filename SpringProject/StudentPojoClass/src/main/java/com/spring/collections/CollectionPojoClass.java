package com.spring.collections;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionPojoClass {

	private List<String> language;
	private Set<String> students;
	private Map<String, String> courses;
	
	public List<String> getLanguage() {
		return language;
	}

	public void setLanguage(List<String> language) {
		this.language = language;
	}

	public Set<String> getStudents() {
		return students;
	}

	public void setStudents(Set<String> students) {
		this.students = students;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	public CollectionPojoClass(List<String> language, Set<String> students, Map<String, String> courses) {
		
		this.language = language;
		this.students = students;
		this.courses = courses;
	}
	
	public CollectionPojoClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void display() {
		
		System.out.print("Languages - ");
		Iterator<String> itr = language.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.print("\n"+"Students - ");
		Iterator<String> itrs = students.iterator();
		while(itrs.hasNext()) {
			System.out.print(itrs.next()+" ");
		}
		System.out.println("\n"+"Courses - ");
		Iterator<Map.Entry<String, String>> it = courses.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

	
	
	
}
