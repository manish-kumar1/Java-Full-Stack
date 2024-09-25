package com.java.spring.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.spring.employee.Employee;

@Configuration
public class EmployeeSpringConfigFile {
	
	@Bean
	public Employee employee() {
		
		Employee emp = new Employee();
		
		emp.setEmpId("JKL123PQ");
		emp.setEmpName("Shamshad Ali");
		emp.setSalary(1500);
		
		return emp;
	}
	@Bean("empObj")
	public Employee employee2() {
		
		Employee emp2 = new Employee();
		emp2.setEmpId("PQRS231JS");
		emp2.setEmpName("Alex Carry");
		emp2.setSalary(30200);
		return emp2;
	}
}
