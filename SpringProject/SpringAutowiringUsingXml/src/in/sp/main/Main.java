package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {

	public static void main(String[] args) {
		
		String spring_config_path = "/in/sp/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(spring_config_path);
		
		Student std = (Student) context.getBean("stdId");
		std.display();
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
