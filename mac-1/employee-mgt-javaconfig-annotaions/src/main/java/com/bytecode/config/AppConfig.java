package com.bytecode.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.bytecode.bean.Employee;
import com.bytecode.service.EmployeeService;

@Configuration
public class AppConfig {

    @Bean
    public Employee employee() {
        return new Employee(103, "Amit Sharma", 65000);
    }

    @Bean
    public EmployeeService employeeService() {
        return new EmployeeService(employee());
    }
}
