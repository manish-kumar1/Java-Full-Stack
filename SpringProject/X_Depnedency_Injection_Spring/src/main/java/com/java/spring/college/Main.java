package com.java.spring.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String config_path = "/in/spring/resources/college.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(config_path);
		
		Student stdx = (Student) context.getBean("stdId");
		stdx.display();
		
		((ClassPathXmlApplicationContext) context).close();
	}

}
