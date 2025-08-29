package com.bytecode.jdbc.ps;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        sc.close();

        Student student = new Student(name, age, address, phone, email);
        StudentDAO dao = new StudentDAO();

        boolean success = dao.insertStudent(student);

        if (success) {
            System.out.println("Student record inserted successfully!");
        } else {
            System.out.println("Failed to insert student record.");
        }
    }
}
