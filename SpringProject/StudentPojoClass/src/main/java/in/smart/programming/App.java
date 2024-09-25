package in.smart.programming;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        String config_path = "spring/config/xml/applicationContext.xml";
        
        ApplicationContext context = new ClassPathXmlApplicationContext(config_path);
        
        Student std = (Student) context.getBean("stdId");
        std.display();
        
        Student std1 = (Student) context.getBean("stdId2");
        std1.display();
        
        ((ClassPathXmlApplicationContext) context).close();
    }
}
