package org.example;

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
        ApplicationContext Student = new ClassPathXmlApplicationContext();
        Student s= context.getBean("st");

        System.out.println( "Hello World!" );


    }
}
