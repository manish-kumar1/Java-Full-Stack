package com.java.spring;

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
        
        String cofig_path = "/in/spring/resources/sbiContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(cofig_path);
        
        BankSBI bank = (BankSBI) context.getBean("sbi");
        
        System.out.print(bank.getReservBank());
        
        System.out.println(bank.getBankName());
        System.out.println(bank.getBranchName());
        System.out.println(bank.getRateOfInterest());
        System.out.println(bank.getWidthrowalLimit());
        System.out.println("------------------------");
        System.out.println(bank.getReservBank().getMainBranch());
        System.out.println(bank.getReservBank().getName());
        System.out.println(bank.getReservBank().getRoi());
//        
        ((ClassPathXmlApplicationContext)context).close();
        
        		
    }
}
