package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.JavaCollection;

public class Main {

	public static void main(String[] args) {
		
		String config_path = "/in/sp/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_path);
		
		JavaCollection jsc =(JavaCollection) context.getBean("idr");
		jsc.display();
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
