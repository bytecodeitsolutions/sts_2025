package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Create or Update
    public Student saveStudent(Student student) {
        System.out.println("Service: Saving student");
        return studentRepository.save(student);
    }

    // Read All
    public List<Student> getAllStudents() {
        System.out.println("Service: Fetching all students");
        return studentRepository.findAll();
    }

    // Read by ID
    public Student getStudentById(Long id) {
        System.out.println("Service: Fetching student by id " + id);
        return studentRepository.findById(id).orElse(null);
    }

    // Delete
    public void deleteStudent(Long id) {
        System.out.println("Service: Deleting student by id " + id);
        studentRepository.deleteById(id);
    }
}
