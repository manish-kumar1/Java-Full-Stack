package com.java.spring.college;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Marks {

	private Map<String, String> marks;

	public Map<String, String> getMarks() {
		return marks;
	}

	public void setMarks(Map<String, String> marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Marks [marks=" + marks + "]";
	}

	public Set<Entry<String, String>> entrySet() {
		// TODO Auto-generated method stub
		if(marks != null) {
			return marks.entrySet();
		}
		else {
			return Set.of();
		}
	}
	
}
