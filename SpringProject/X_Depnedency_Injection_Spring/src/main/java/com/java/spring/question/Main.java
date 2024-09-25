package com.java.spring.question;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String config_path = "in/spring/resources/question.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_path);
		
		Question que = (Question) context.getBean("q");
		que.displayInfo();
		
		((ClassPathXmlApplicationContext) context).close();
	}

}
