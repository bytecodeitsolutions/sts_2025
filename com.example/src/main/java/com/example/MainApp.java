package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

       Customer customer = context.getBean("customerBean", Customer.class);
       Customer customer1 = context.getBean("customerBean", Customer.class);
      System.out.println(customer.getAccount().getBalance());
      
      System.out.println(customer.hashCode());
      System.out.println(customer1.hashCode());
    }
}
