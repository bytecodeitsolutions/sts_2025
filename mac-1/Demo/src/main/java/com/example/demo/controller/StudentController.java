package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Create
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        System.out.println("Controller: Adding student");
        return studentService.saveStudent(student);
    }

    // Read All
    @GetMapping
    public List<Student> getAllStudents() {
        System.out.println("Controller: Getting all students");
        return studentService.getAllStudents();
    }

    // Read One
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id) {
        System.out.println("Controller: Getting student " + id);
        return studentService.getStudentById(id);
    }

    // Delete
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        System.out.println("Controller: Deleted student " + id);
        return "Student deleted successfully";
    }
}
