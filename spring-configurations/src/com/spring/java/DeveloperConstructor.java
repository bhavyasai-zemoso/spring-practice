package com.spring.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DeveloperConstructor {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        IDeveloper developer = context.getBean("webDeveloper",IDeveloper.class);
        System.out.println(developer.displaySkills());
        System.out.println(developer.displayCustomer());
        context.close();
    }
}
 