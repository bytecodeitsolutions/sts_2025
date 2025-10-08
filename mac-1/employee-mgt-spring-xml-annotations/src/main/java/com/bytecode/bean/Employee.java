package com.bytecode.bean;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private int id = 102;
    private String name = "John Doe";
    private double salary = 60000;

    public void display() {
        System.out.println("Employee: " + id + " | " + name + " | ₹" + salary);
    }
}
