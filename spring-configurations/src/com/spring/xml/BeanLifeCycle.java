package com.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycle.xml");
        IDeveloper developer = context.getBean("myWebDeveloper",IDeveloper.class);
        System.out.println(developer.displaySkills());
        System.out.println(developer.displayCustomer());
        context.close();
    }
}
 