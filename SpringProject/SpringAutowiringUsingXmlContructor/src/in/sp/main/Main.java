package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Employee;

public class Main {

	public static void main(String[] args) {
		
		String spring_path = "/in/sp/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(spring_path);
		
		Employee emp = (Employee) context.getBean("empId");
		emp.display();
		
		Employee emp2 = (Employee) context.getBean("empId2");
		emp2.display();
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
