package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigUsingJavaClass;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigUsingJavaClass.class);
		
		Student std = (Student) context.getBean("stdId");
		std.display();
		
		Student std1 = (Student) context.getBean("stdId2");
		std1.display();
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
