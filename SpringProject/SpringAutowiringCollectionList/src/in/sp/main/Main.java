package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigAutowired;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigAutowired.class);
		
		Student std = (Student) context.getBean(Student.class);
		std.display();
		
		((AnnotationConfigApplicationContext) context).close();
	}
}
