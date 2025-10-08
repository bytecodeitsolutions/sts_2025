package com.bytecode.bean;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee Details:");
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}
