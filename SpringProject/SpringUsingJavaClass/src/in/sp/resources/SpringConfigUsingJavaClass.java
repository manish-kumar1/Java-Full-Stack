package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigUsingJavaClass {

	@Bean
	public Student stdId() {
		
		Student std = new Student();
		
		std.setName("Alex");
		std.setFees(2600);
		std.setEmail("alex.carry@gmail.com");
		
		return std;
	}
	
	@Bean
	public Student stdId2() {
		
		Student std1 = new Student();
		
		std1.setName("Alex");
		std1.setFees(2600);
		std1.setEmail("alex.carry@gmail.com");
		
		return std1;
	}
}
