package in.smart.programming.PojoClassSpring;

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
        
        String config_path = "spring/application/context/config/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_path);
        
        Employee employee = (Employee) context.getBean("empId");
        employee.display();
        
        ((ClassPathXmlApplicationContext) context).close();
    }
}
