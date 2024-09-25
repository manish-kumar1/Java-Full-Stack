package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigUsingConstructor {
	
	@Bean
	public Address createAddObj() {
		
		Address addr = new Address(123, "Punjab", 948593);
		return addr;
		
	}
	@Bean
	public Student createStdObj() {
		
		Student std = new Student("Alex Carry", 34, createAddObj());
		return std;
	}
	
}	
