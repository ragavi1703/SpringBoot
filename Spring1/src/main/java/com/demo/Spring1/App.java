package com.demo.Spring1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.Spring1.config.AppConfig;



public class App 
{
    public static void main( String[] args )
    {
    ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    
    Alien al1= context.getBean(Alien.class);
   // al1.setAge(21); commenting this because want to set age from app.config
    System.out.println(al1.getAge());
    al1.code();
    
//    Desktop dt=context.getBean(Desktop.class);
//    dt.compile();
//    
//    Desktop dt1=context.getBean(Desktop.class);
//    dt1.compile();
    
    
//    	The below are code done using xml config and the above is java config
//    	ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        
    
//    Alien al1= context.getBean("alien",Alien.class);
//    al1.setAge(21);
//    System.out.println(al1.getAge());
//    al1.code();
//        
//        Alien al2=(Alien) context.getBean("alien");
//        System.out.println(al2.age);
        
//        
//        Computer cm=context.getBean(Computer.class);
//        Desktop lp=context.getBean("com2",Desktop.class);
//        lp.compile();
    }
}
