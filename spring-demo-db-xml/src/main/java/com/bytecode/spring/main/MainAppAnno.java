package com.bytecode.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bytecode.spring.config.AppConfig;
import com.bytecode.spring.dao.StudentDao;
import com.bytecode.spring.model.Student;

public class MainAppAnno {
    public static void main(String[] args) {
       // ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    	StudentDao dao = (StudentDao) context.getBean(StudentDao.class);

        Student s = new Student();
        s.setId(3);
        s.setName("Naseem");
        s.setAge(26);
        
        dao.insert(s);
        System.out.println("Record Inserted.");
    }
}
