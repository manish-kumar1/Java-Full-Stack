package ci.dependent.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ci.dependent.object.Employee;

public class UseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String config_path = "/ci/java/resources/Employee.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_path);
		
		Employee emp = (Employee) context.getBean("emp");
		emp.display();
		
		((ClassPathXmlApplicationContext) context).close();
	}

}
