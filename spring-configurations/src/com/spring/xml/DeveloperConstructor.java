package com.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeveloperConstructor {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        IDeveloper developer = context.getBean("myWebDeveloper",IDeveloper.class);
        System.out.println(developer.displaySkills());
        System.out.println(developer.displayCustomer());
        context.close();
    }
}
 