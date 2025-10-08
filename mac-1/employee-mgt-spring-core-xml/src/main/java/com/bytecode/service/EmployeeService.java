package com.bytecode.service;
import com.bytecode.bean.Employee;

public class EmployeeService {
    private Employee emp;

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public void showDetails() {
        emp.display();
    }
}
