package in.sp.beans;

import java.util.ArrayList;


public class Subjects {
	
	private ArrayList<String> subjects;

	public ArrayList<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(ArrayList<String> subjects) {
		this.subjects = subjects;
	}
	
	@Override
	public String toString() {
		return subjects.toString();
	}
}
