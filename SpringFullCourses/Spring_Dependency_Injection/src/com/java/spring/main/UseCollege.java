package com.java.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.spring.college.College;

public class UseCollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String config_path = "/com/java/spring/resources/college.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_path);
		
		College col = (College) context.getBean("clg");
		col.display();
		
		((ClassPathXmlApplicationContext) context).close();
		
	}

}
