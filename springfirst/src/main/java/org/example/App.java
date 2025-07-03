package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource.xml");

        Student student = (Student) context.getBean("student");
        student.register();
        student.attendClass();

        group groupObj = (group) context.getBean("group");
        groupObj.formGroup();
        groupObj.assignLeader();

        course courseObj = (course) context.getBean("course");
        courseObj.enroll();
        courseObj.conductExam();

        System.out.println("All methods executed.");
    }
}