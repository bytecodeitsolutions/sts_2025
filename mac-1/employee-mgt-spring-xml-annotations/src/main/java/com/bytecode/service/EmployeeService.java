package com.bytecode.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.bytecode.bean.Employee;

@Component
public class EmployeeService {
    @Autowired
    private Employee emp;

    public void showDetails() {
        emp.display();
    }
}
