package com.java.spring.customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String config_path = "/in/spring/resources/customer.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_path);
		
		Customer customer = (Customer) context.getBean("custId");
		customer.display();
		
		
		((ClassPathXmlApplicationContext) context).close();
		
	}

}
