package com.java.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.collection.constructor.CS_Student;

public class UseCS_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String config_path = "/com/java/spring/resources/csstudent.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_path);
		
		CS_Student cstd = (CS_Student) context.getBean("cse");
		cstd.display();
		
		((ClassPathXmlApplicationContext) context).close();
	}

}
