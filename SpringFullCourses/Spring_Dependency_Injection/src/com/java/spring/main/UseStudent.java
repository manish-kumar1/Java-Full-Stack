package com.java.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.spring.student.Student;

public class UseStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String config_path = "/com/java/spring/resources/student.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_path);
		
		Student std = (Student) context.getBean("stdId");
		std.display();
		
		Student std2 = (Student) context.getBean("stdId2");
		std2.display();
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
