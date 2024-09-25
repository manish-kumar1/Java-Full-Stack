package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigUsingJavaClass {
	
	@Bean
	public Address createAddObj() {
		
		Address addr = new Address();
		addr.setHouseno(1121);
		addr.setCity("Bangalore");
		addr.setPincode("560029");
		
		return addr;
	}
	
	@Bean
	public Student createStdObj(){
		
		Student std = new Student();
		std.setName("Mister Kumar");
		std.setAge(21);
		std.setAddress(createAddObj());
		
		return std;
		
	}
}
