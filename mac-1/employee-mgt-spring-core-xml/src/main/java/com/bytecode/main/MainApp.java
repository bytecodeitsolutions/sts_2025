package com.bytecode.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bytecode.service.EmployeeService;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService service = ctx.getBean("empService", EmployeeService.class);
        service.showDetails();
    }
}
