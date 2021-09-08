package com.bonnlee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

       ApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");

       Student stu = (Student) context.getBean("stu");
       Student stu2 = (Student) context.getBean("stu");
        System.out.println(stu == stu2);

    }
}
