package com.java.spring.college;

import java.util.Map;

public class BTech {
	
	private static final int yearsOfCourse = 4;
	private static final int fees = 400000;
	
	private Map<String, Integer> subj;

	public Map<String, Integer> getSubj() {
		return subj;
	}

	public void setSubj(Map<String, Integer> subj) {
		this.subj = subj;
	}

	public static int getYearsofcourse() {
		return yearsOfCourse;
	}

	public static int getFees() {
		return fees;
	}
	
	

}
