package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// keep the controller simple, it should not contain any business logic

@RestController // This annotation is used to mark a class as a controller, serving rest endpoints
@RequestMapping(path = "api/v1/student") // This annotation is used to map web requests to Spring Controller methods
public class StudentController {
    private StudentService studentService; // This is a dependency

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping() // This annotation is used to map HTTP requests to handler methods, this is rest endpoint.
    public List<Student> getStudents() {
        return studentService.getStudents(); // endpoint returns a list of students
    }
}
