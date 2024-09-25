package com.java.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.spring.company.Company;
import com.java.spring.resources.CompanyConfigFile;

public class UseCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String config_path = "/com/java/spring/resources/company.xml";
//		ApplicationContext context = new ClassPathXmlApplicationContext(config_path);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CompanyConfigFile.class);
		
		Company comp = (Company) context.getBean("company");
		comp.display();
		
		((AnnotationConfigApplicationContext) context).close();
		
	}

}
