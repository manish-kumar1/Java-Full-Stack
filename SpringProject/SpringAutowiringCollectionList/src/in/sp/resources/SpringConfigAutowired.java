package in.sp.resources;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;

@Configuration
public class SpringConfigAutowired {
	
	@Bean
	public Address createAddObj() {
		
		Address addr = new Address();
		addr.setHouseno(1234);
		addr.setCity("Khawaspur");
		addr.setPincode(841416);
		
		return addr;
	}
	@Bean
	public Address createAddObj1() {
		
		Address addr = new Address();
		addr.setHouseno(14);
		addr.setCity("Siwan");
		addr.setPincode(230016);
		
		return addr;
	}
	@Bean
	public Student createStdObj() {
		
		Student std = new Student();
		std.setName("Mister Kumar");
		std.setFees(4500);
	//	std.setAddress(createAddObj());  // manually DI
	//	std.setSubjects(createSubObj()); // manually DI
		
		return std;
	}
	@Bean
	public Subjects createSubObj() {
		
		Subjects subj = new Subjects();
		ArrayList<String> subject_list = new ArrayList<>();
		subject_list.add("Java");
		subject_list.add("Python");
		subject_list.add("C++");
		subj.setSubjects(subject_list);
		
		return subj;
	}
}
