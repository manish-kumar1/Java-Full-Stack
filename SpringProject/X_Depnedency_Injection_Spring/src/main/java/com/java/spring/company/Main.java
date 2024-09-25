package com.java.spring.company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String config_path = "/in/spring/resources/company.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_path);
		
		Employee emp = (Employee) context.getBean("empId");
		emp.display();
		
		((ClassPathXmlApplicationContext) context).close();
	}

}
