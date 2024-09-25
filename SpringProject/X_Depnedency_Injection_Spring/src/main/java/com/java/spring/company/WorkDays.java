package com.java.spring.company;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WorkDays {

	private Map<String, String> workdays;

	public Map<String, String> getWorkdays() {
		return workdays;
	}

	public void setWorkdays(Map<String, String> workdays) {
		this.workdays = workdays;
	}
	
	public Set<Entry<String, String>> entrySet() {
        if (workdays != null) {
            return workdays.entrySet();
        } else {
            return Set.of(); // Return an empty set if marks is null
        }
    }
}
