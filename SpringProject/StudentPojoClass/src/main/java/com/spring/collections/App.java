package com.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String config_path = "com/config/appContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_path);
		
		CollectionPojoClass cpc =  (CollectionPojoClass) context.getBean("idx");
		cpc.display();
		
		((ClassPathXmlApplicationContext)context).close();

	}

}
