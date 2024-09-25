package com.constructor.injection.person;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String config_path = "/in/spring/resources/person.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_path);
		
		Person prs = (Person) context.getBean("per");
		prs.display();
		
		((ClassPathXmlApplicationContext) context).close();
	}

}
