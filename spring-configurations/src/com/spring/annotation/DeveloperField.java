package com.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeveloperField {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");
        IDeveloper developer = context.getBean("iosDeveloper",IDeveloper.class);
        System.out.println(developer.displaySkills());
        System.out.println(developer.displayCustomer());
        context.close();
    }
}
 