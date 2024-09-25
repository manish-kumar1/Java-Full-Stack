package com.java.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.spring.doctor.Doctor;
import com.java.spring.resources.DoctorSpringConfigFile;

public class UseDoctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(DoctorSpringConfigFile.class);
		
		Doctor doct = (Doctor) context.getBean("beanObjDoc");
		doct.displayInfo();
		
		((AnnotationConfigApplicationContext) context).close();
	}

}
