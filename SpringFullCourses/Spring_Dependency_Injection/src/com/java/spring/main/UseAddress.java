package com.java.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.spring.address.Engineer;

public class UseAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String config_path = "/com/java/spring/resources/engineer.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_path);
		
		Engineer eng = (Engineer) context.getBean("engr");
		eng.display();
		
		Engineer engi = (Engineer) context.getBean("engr2");
		engi.display();
		
		((ClassPathXmlApplicationContext) context).close();
	}

}
