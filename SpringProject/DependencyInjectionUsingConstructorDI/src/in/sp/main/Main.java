package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigUsingConstructor;

public class Main {
	
	public static void main(String[] args)throws Exception {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigUsingConstructor.class);
		
		Student std = (Student) context.getBean(Student.class);
		std.display();
		
		
		
		((AnnotationConfigApplicationContext) context).close();
	}
}
