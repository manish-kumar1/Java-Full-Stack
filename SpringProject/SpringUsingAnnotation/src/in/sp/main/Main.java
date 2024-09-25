package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
			
			Student std = (Student) context.getBean("student");
			std.display();
			((ClassPathXmlApplicationContext) context).close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
