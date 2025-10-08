package com.bytecode.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.bytecode.service.EmployeeService;
import com.bytecode.config.AppConfig;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService service = ctx.getBean(EmployeeService.class);
        service.showDetails();
    }
}
