package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Question;

public class Main {
	
	public static void main(String[] args) {
		
		String config_path = "/in/sp/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_path);
		
		Question que = (Question) context.getBean("q");
		que.displayInfo();
		
		((ClassPathXmlApplicationContext) context).close();

	}
}