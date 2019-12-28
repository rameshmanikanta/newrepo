package com.app.plainspringjdbccurdoperation;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.dao.DemoBean;
import com.app.pojo.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("xml/com/app/cfg.xml");
                          DemoBean d=(DemoBean)context.getBean("demoBean");
                          //d.insertrecordbasedondemobean(8080,"krishna",6500,"krishna@gmail.com","krishna");
    	                   /*List<Employee> e=d.getAllEmployee();
    	                   for(Employee ee:e)
    	                   {
    	                	 System.out.println(ee.getEmpid()+"  "+ee.getEname()+"  "+ee.getEsal()+"  "+ee.getEmail()+"  "+ee.getPassword());  
    	                   }*/
                          d.update32(4040,"mahesh",7500,"mahesh@gmail.com","mahesh");
                           //d.deleterecorddemobean(6060);
                          //Employee ee=d.GetEmployee(8080);
                          //System.out.println(ee.getEmpid()+"  "+ee.getEname()+"  "+ee.getEsal()+"  "+ee.getEmail()+"  "+ee.getPassword());  
                          System.out.println( "Hello World!" );
    }
}
