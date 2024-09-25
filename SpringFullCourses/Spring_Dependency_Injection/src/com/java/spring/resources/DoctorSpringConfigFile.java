package com.java.spring.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.spring.doctor.Address;
import com.java.spring.doctor.Doctor;

@Configuration
public class DoctorSpringConfigFile {

	@Bean
	public Address beanObjAddr() {
		
		Address add = new Address();
		add.setCity("Siwan");
		add.setPincode("9463464");
		add.setState("Bihar");
		add.setCountry("India");
		
		return add;
	}
	@Bean
	public Doctor beanObjDoc() {
		
		Doctor doc = new Doctor();
		doc.setId("DOC234Z");
		doc.setName("Dr. Junny Sins");
		doc.setQualification("MBBS");
		doc.setSpecilization("Heart");
		doc.setAddress(beanObjAddr());
		
		return doc;
	}
}
