package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigAutowired {
	
	@Bean
	public Address createAddObj() {
		
		Address addr = new Address();
		addr.setHouseno(234);;
		addr.setCity("Madarpur");
		addr.setPincode(34512);
		
		return addr;
	}
	@Bean
	public Student createStdObj() {
		
		Student std = new Student();
		std.setName("Munna Bhaiya");
		std.setAge(28);
		// std.setAddress(createAddObj());  //mainually DI
		
		return std;
	}
}
