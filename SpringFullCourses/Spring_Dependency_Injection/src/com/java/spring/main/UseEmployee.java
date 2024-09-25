package com.java.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.spring.employee.Employee;
import com.java.spring.resources.EmployeeSpringConfigFile;

public class UseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String config_path = "/com/java/spring/resources/employee.xml";
		
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeSpringConfigFile.class);
		
		Employee emp = (Employee) context.getBean("employee");
		emp.display();
		
		Employee newemp = (Employee) context.getBean("empObj");
		newemp.display();
		
		((AnnotationConfigApplicationContext) context).close();
	}

}
